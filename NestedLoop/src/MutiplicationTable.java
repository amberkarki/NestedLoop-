import java.util.Scanner;

public class MutiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		
		System.out.println("          ***MutiplicationTable***"); // Table title
				System.out.print("       ");
try{
	System.out.println("Enter only valid digits:"); // Taking input from  users 
	
int number=input.nextInt();

	String out=""; // string to   display  number top of the table  head 
	
	for(int i=1;i<=number;i++) // this outer loop will display number  top of the table 
	{
		 
		out+=i+"   "; // Concatenate i as  to   print string. 
		
	}
	System.out.print("    "  + out); // string to display  number 

		 System.out.println("\n------------------------------------------------");
		 
		   for(int k=1;k<=number;k++){ // inner loop for the table body with nested loop
			   System.out.print(k +  " | ");	// This for the side bar 
			   
			   		for(int j=1;j<=number;j++){	 // this for loop actually display body part of table   								
			   				System.out.printf("%4d", k * j);// formating  to display table body
		 }
			   	System.out.println(); // this print line will print empty single line to gap between two row
			   	                      //when multiply and terminated with nested loop and back to outer  loop of nested loop
	}
}


catch(Exception e) // exception error  
{
	System.out.println("Sorry invalid input !!! Please Enter  Only Digits !");
	}
input.close();
	}

}
