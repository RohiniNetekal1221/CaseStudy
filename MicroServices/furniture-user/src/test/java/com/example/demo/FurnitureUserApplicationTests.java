package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.assertj.core.api.Assertions;

import com.sonata.mvc.model.Customer;
import com.sonata.mvc.repository.CustomerRepository;

import java.util.Optional;

@SpringBootTest
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class FurnitureUserApplicationTests {
	
	@Autowired
	public CustomerRepository prep;
	//@Autowired
	//ProductController pcont;
	
	Optional<Customer> p1;
	
	 
      
      @Test
      public void testReadALL() {
          List <Customer> list = prep.findAll();
          assertThat(list).size().isGreaterThan(15);
      }
	
      @Test
      public void getAllUserDataTest(){
  List<Customer> customer = prep.findAll();
            Assertions.assertThat(customer.size()).isEqualTo(16);
            
            System.out.println(customer);
        }
      
      
      
      
      @Test
  	public void testCreate () {
    	Customer p = new Customer();
  		p.setCustomerID(101L);
  		p.setCustomerName("testCustomer");
  		p.setEmail("test@gmail.com");
  		p.setDateofbirth("01-01-1999");
  		p.setPhone(98765454);
  		p.setUsername("testUser");
  		p.setPassword("testUser@19");
  		prep.save(p);
  		assertNotNull(prep.findById("testUser").get());
  	}
      
      
      
      
	/*
	 * 
	 * 
	 * @Test
      public void testDelete() {
    	  prep.deleteById(10L);
          assertThat(prep.existsById(10L)).isEqualTo(true);
          
      }
	 * 
	 * 
	 * @Test
	public void testCreate () {
		Product p = new Product();
		p.setProductID(1L);
		p.setCategoryID(5);
		p.setProductName("Wooden Chair");
		p.setProductDescription("Wooden Chair");
		p.setProductImage("https://www.ulcdn.net/images/products/334899/slide/666x363/Owen_Lounge_Chair_Mustard_Yellow_5.jpg?1619007579");
		p.setProductPrice(2000);
		prep.save(p);
		assertNotNull(prep.findById(1L).get());
	}
	
	 * @Test
      public void testSingleProduct() {
         Product product=prep.findById(1L).get();
          assertEquals(2,product.getProductID());
      }
      
      @Test
          public void testUpdate() {
          
    	  Product p=prep.findById(1L).get();
          p.setProd_quantity(20);
          prep.save(p);
          assertNotEquals(10,prep.findById(1L).get().getProd_quantity());
          
              
          }
	@Test
	public void addProductTest() throws Exception{
		Product product = new Product();
		product.setCategoryID(10);
		product.setProductID(100);
		product.setProductName("Wooden Chair");
		product.setProductDescription("Wooden Chair");
		product.setProductImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTypgsFDButNypazJ-UbTCDQMzXSTKwocawvg&usqp=CAU");
		product.setProductPrice(5000);
		ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        ObjectWriter objectWriter = mapper.writer().withDefaultPrettyPrinter();
		String requestJson = objectWriter.writeValueAsString(product);
		
		when(prep.save(new Product())).thenReturn(product);
		
		mockMvc.perform(post("/add/product").content(requestJson).contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isCreated())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$.productName").value("Wooden Chair"))
        .andExpect(jsonPath("$.categoryID").value(10))
        .andExpect(jsonPath("$.productID").value(100))
        .andExpect(jsonPath("$.productDescription").value("Wooden Chair"))
        .andExpect(jsonPath("$.productImage").value("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTypgsFDButNypazJ-UbTCDQMzXSTKwocawvg&usqp=CAU"))
        .andExpect(jsonPath("$.productPrice").value(5000))
        ;

		verify(prep, times(1)).save(any(Product.class));
		verifyNoMoreInteractions(prep);
}

@Test
      public void savedProduct_Success() {
          Product product = new Product();
          product.setProductID(100L);
          product.setCategoryID(10);
          product.setProductName("Table");
          product.setProductImage("data:image/jpeg;base64,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");
          product.setProductDescription("Table");
          product.setProductPrice(2000);
          
          when(pserv.save(any(Product.class))).thenReturn(product);

          Product savedProd = (Product) pserv.save(product);
          assertThat(savedProd.getProductID()).isNotNull();
      }
*/
}
