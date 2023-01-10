import java.util.Scanner;

public class ATM {

	private double bal = 5000;
	private int pwd;
	public void dep(double money) {
		bal = bal + money;
		System.out.print("Enter Your password: ");		
		Scanner sc = new Scanner(System.in);
		pwd = sc.nextInt();

		if(pwd == 1997) {
			System.out.println("Deposited Money: " +money);
			System.out.println("Current Balance: " + bal);
		}
		else {
			System.out.println("Entered password is Worng");
		}
	}
	public void wit(double money) {
		bal = bal - money;
		System.out.print("Enter Your password: ");		
		Scanner sc = new Scanner(System.in);
		pwd = sc.nextInt();
		if(pwd == 1997) {
			System.out.println("Withdrawn Money: " +money);
			System.out.println("Current Balance: " + bal);
		}
		else {
			System.out.println("Entered password is Worng");
		}
	}
	public void bal() {
		System.out.print("Enter Your password: ");		
		Scanner sc = new Scanner(System.in);
		pwd = sc.nextInt();
		if(pwd == 1997) {
			System.out.println("Current Balance: " + bal);
		}
		else {
			System.out.println("You have Entered the worng password");
		}
	}	
}
class call{
	public static void main(String[] args) {
		ATM a = new ATM();
		int c;
		System.out.println("click 1 to make Deposite");
		System.out.println("click 2 to Withdraw money");
		System.out.println("click 3 to Check Balance");
		System.out.print("\nEnter Your Choice: ");
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		switch(c) {
		case 1: a.dep(1);
		break;
		case 2: a.wit(0);
		break;
		case 3: a.bal();
		break;
		default: System.out.println("There is no such choice");
		break;
		}
			
	}
}
