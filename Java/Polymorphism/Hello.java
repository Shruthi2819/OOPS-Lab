class InvoiceProcessor{
public void generateInvoice(String customer,double amount){
double total=calculate(amount);
System.out.println("Customer: "+customer+" Amount: "+total);
}
private double calculate(double amount){
return amount+amount*0.1;
}
public void process(String customer,double amount){
generateInvoice(customer,amount);
}
}

class RetailInvoice extends InvoiceProcessor{
public void generateInvoice(String customer,double amount){
double discount=amount*0.1;
double finalAmount=amount-discount;
System.out.println("Retail Customer: "+customer+" Amount: "+finalAmount);
}
}

public class Hello{
public static void main(String[] args){
InvoiceProcessor ip=new InvoiceProcessor();
ip.process("John",1000);
RetailInvoice ri=new RetailInvoice();
ri.process("Alice",1000);
InvoiceProcessor ref=new RetailInvoice();
ref.process("Bob",1000);
}
}