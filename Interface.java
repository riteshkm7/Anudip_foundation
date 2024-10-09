package Interface_bank;
import java.util.*;

public class Interface {
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		saving save=new saving();
		bussiness bus=new bussiness();
		current cur=new current();
		System.out.println("1.for saving account");
		System.out.println("2.for business accoutn");
		System.out.println("3.for current account");
		int a=sc.nextInt();
		
		switch(a){
		case 1:{
			System.out.println("saving");
			System.out.println("1.for balance:");
			System.out.println("2.for deposit:");
			System.out.println("3.for withdraw:");
			int b=sc.nextInt();
			switch(b) {
			case 1:
				save.balance();
				break;
			case 2:
				System.out.println("enter amount to deposit");
				double e=sc.nextDouble();
				save.deposit(e);
				break;
			case 3:
				
				System.out.println("enter amount you want to withdraw:");
				double d=sc.nextInt();
				save.withdraw(d);
				break;
			default:
				System.out.println("enter valid input:");
				break;
			} break;
			
			
			}
		case 2:{
			System.out.println("Business");
			System.out.println("1.for balance:");
			System.out.println("2.for deposit:");
			System.out.println("3.for withdraw:");
			int f=sc.nextInt();
			switch(f) {
			case 1:
				bus.balance();
				break;
			case 2:
				System.out.println("enter amount to deposit");
				double e=sc.nextDouble();
				bus.deposit(e);
				break;
			case 3:
				
				System.out.println("enter amount you want to withdraw:");
				double d=sc.nextInt();
				bus.withdraw(d);
				break;
			default:
				System.out.println("enter valid input:");
			break;	}
			break;
			
			}
		case 3:{
			System.out.println("saving");
			System.out.println("1.for balance:");
			System.out.println("2.for deposit:");
			System.out.println("3.for withdraw:");
			System.out.println("4.for loan:");
			
			int g=sc.nextInt();
			switch(g) {
			case 1:
				cur.balance();
				break;
			case 2:
				System.out.println("enter amount to deposit");
				double e=sc.nextDouble();
				cur.deposit(e);
				break;
			case 3:
				
				System.out.println("enter amount you want to withdraw:");
				double d=sc.nextInt();
				cur.withdraw(d);
				break;
			case 4:
				System.out.println("enter amount you want to take loan:");
				double h=sc.nextInt();
				cur.loan(h);
				break;
				
			default:
				System.out.println("enter valid input:");
			break;	
			} break;
			
			}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		}
		
	}
	
}

interface Account{
	
       void balance();
       void withdraw(double d);
       void deposit(double e);
       
}
class saving implements Account{
	public double bal=10000;
	public void balance() {
		System.out.println("your balance is "+bal);
		
	}
	public void withdraw(double d) {
		String s=d<bal?"true":"false";
		if(s=="true") {
			bal+=bal-d;
			System.out.println("withdraw success:");
			
		}
		else {
			System.out.println("insufficent balance");
		}
		
	}
	public void deposit(double e) {
		bal=bal+e;
		
		System.out.println("your current balance after deposit is:"+bal);
		
	}
	
	
	
	
}

class current implements Account{
	public double bal=20000;
	
	public void balance() {
		System.out.println("your balance is+"+bal);
		
	}
	public void withdraw(double d) {
		String s=d<bal?"true":"false";
		if(s=="true") {
			bal+=bal-d;
			System.out.println("withdraw success:");
			
		}
		else {
			System.out.println("insufficent balance");
		}
		
	}
	public void deposit(double e) {
		bal=bal+e;
		
		System.out.println("your current balance after deposit is:"+bal);
		
	}
	public double l;
	void loan(double l) {
		this.l=l;
		System.out.println("Loan Department");
		System.out.println("your loan amount is:" +l);
		bal=bal+l;
		System.out.println("loan success now your balance is:"+bal);
		
	}
	
}
class bussiness implements Account{
	public double bal=10000;
	public void balance() {
		System.out.println("your balance is+"+bal);
		
	}
	public void withdraw(double d) {
		String s=d<bal?"true":"false";
		if(s=="true") {
			bal+=bal-d;
			System.out.println("withdraw success:");
			System.out.println("your balance is: "+bal);
			
		}
		else {
			System.out.println("insufficent balance");
		}
		
	}
	public void deposit(double e) {
		bal=bal+e;
		
		System.out.println("your current balance after deposit is:"+bal);
		
	}
	
	
}
