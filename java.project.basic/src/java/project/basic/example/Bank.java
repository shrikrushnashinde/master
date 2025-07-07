package java.project.basic.example;

class Bank{
	
	int amt = 1000;
	int debitCount = 0;
	int creditCount = 0;
	
	public void creditAmt(){
		amt = amt + 300;
		creditCount++;
	}
	
	public void debitAmt(){
		amt = amt - 500;
		debitCount++;
	}
	
	public void display(){
		System.out.println("Your current balance is:"+ amt);
	}
	
	public void displayCount(){
		System.out.println("Your debit amount count is:"+ debitCount);
		System.out.println("Your credit amount count is:"+ creditCount);
	}
	
	public static void main(String args[]){
		Bank b1 = new Bank();
		b1.debitAmt();
		b1.creditAmt();
		b1.creditAmt();
		b1.creditAmt();
		b1.display();
		b1.displayCount();
	}
}