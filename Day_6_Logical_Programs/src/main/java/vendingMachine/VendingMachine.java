package vendingMachine;

public class VendingMachine {

	static int i=0;
  	static int total=0;
  	
	//Initialization of New Array
	static int[] notes = { 1000,500,100,50,10,5,2,1};
	static int money;
	
	// Function for Calculating the notes
	public static  int calculate(int money,int[]notes ) {
		int rem;
		
		if(money==0)
		{
			return -1 ;
		}
		else {
			if(money>=notes[i]) {
				// logic for Calculating The notes
				int calNotes =money/notes[i];
				rem = money%notes[i];
				money =rem;
				total += calNotes;
				System.out.println(notes[i]+   " Notes ---> " +calNotes );
			}
		}
		i++;
		return calculate(money, notes);
	}
	public static void main(String[] args) {
		
		Helper hp = new Helper();
		
		//ask the user enter the money
		System.out.print("Enter the Amount:");
		money =hp.inputInteger();
		
		// Creating The Object of Vending MAchine class
		VendingMachine.calculate(money,notes);
		System.out.println("Total Number of Notes are :"+total);

	}

}
