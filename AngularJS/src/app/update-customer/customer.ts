export class Customer {
   
        id: number;
        username: string;
        password: string;
        email: string;
        phone: number;
        active: boolean;
        
        customerName: string;
        dateofbirth: string;
        address: string;
        constructor(id:number, username:string,password:string, email:string, phone:number,  customerName: string, dateofbirth: string, address: string)
        {
            this.id=id;        
            this.username=username;
            this.password=password;
            this.email=email;
            this.phone=phone;
            this.customerName=customerName;
            this.dateofbirth=dateofbirth;
            this.address=address;

           // this.branch_id=branch_id;
    
        }
    
}
