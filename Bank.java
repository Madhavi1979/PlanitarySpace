class Account
{
float acc_no;
String name;
float amount;
void insert_data_Account_holder(float a,String n,float s)
{
acc_no=a;
name=n;
amount=s;
}
void display() {System.out.println(acc_no+" "+name+" "+amount);}
void checkBalance() {System.out.println("Balance is :"+amount);}
void deposit(float amt){
amount=amount+amt;
System.out.println(amt+" deposited");
}
void withdraw(float amt){
if(amount<amt){
System.out.println("Insufficient Balance");
}else{
amount=amount-amt;
System.out.println(amt+" withdrawn");
}
  }
}
public class twentysecond {
public static void main(String[] args)
{
Account a1=new Account();
a1.insert_data_Account_holder(1832345,"Amit",10000);
a1.display();
a1.checkBalance();
a1.deposit(40000);
a1.checkBalance();
a1.withdraw(15000);
a1.checkBalance();
a1.withdraw(75000);
}
}
