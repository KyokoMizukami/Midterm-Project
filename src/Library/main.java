package Library;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {


	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("1: A smile in the mind","2: The Power of Now","3: Lean In","1: At the Mountains of Madness","2: The Bad Seed","3: Beloved","1: Nine Princes in Amber","2: Return of the King: Being the Third Part of the Lord of the Rings","3: Gardens of the Moon","1: Heart Me","2: Never Again","3: Love of Tomorrow"));
		
		
		Data data = new Data();
		data.addDetail();

		String userName = null;
		String bookcategory = null;
		 String bookTitle = null;
		 String reserveInfo = null;
		 String booknumber = null;

		LocalDate rentDate = LocalDate.now();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		
		while(true)
		{
			
			System.out.println("Enter Your Name: ");
	
				userName = scanner.next();
			
			boolean result = data.addUsername(userName);


			if(result)
			{
				System.out.println("Welcome back: " +  userName);
				reserveInfo = data.addReserve(rentDate,bookTitle, userName);
				System.out.println("\nHere is your reservation");
				System.out.println(reserveInfo + "\n");
				return;
			}
			else{
				System.out.println("Welcome: " +  userName);
			}
	
			System.out.println("\nHere are some categories: ");
			for(Category item: data.getCategory()){
				System.out.println(item);
			}
			System.out.println("Enter the category");


				bookcategory = scanner.next();
				
				
				switch (bookcategory) {
				case "New": 
					for(int i = 0; i < 3; i++) {
			            System.out.println(list.get(i));
			        }
					System.out.println("\nEnter the book title number that you want: ");
					 booknumber = scanner.next();
					 switch(booknumber) {
					 case "1":
						 bookTitle ="A smile in the mind";
						 break;
					 case "2":
						 bookTitle ="The Power of Now";
						 break;
					 case "3":
						 bookTitle ="Lean In";
						 break;
					 }
			           reserveInfo = data.addReserve(rentDate,bookTitle, userName);
						System.out.println("\nHere is your reservation");
						System.out.println(reserveInfo + "\n");
					break;
				case "Horror": 
					for(int i = 3; i < 6; i++) {
			            System.out.println(list.get(i));
			        }
					System.out.println("\nEnter the book title you want: ");
					booknumber = scanner.next();
					 switch(booknumber) {
					 case "1":
						 bookTitle ="At the Mountains of Madness";
						 break;
					 case "2":
						 bookTitle ="The Bad Seed";
						 break;
					 case "3":
						 bookTitle ="Beloved";
						 break;
					 }
			            reserveInfo = data.addReserve(rentDate,bookTitle, userName);
						System.out.println("\nHere is your reservation");
						System.out.println(reserveInfo + "\n");
					break;
				case "Fantasy": 
					for(int i = 6; i < 9; i++) {
			            System.out.println(list.get(i));
			        }
					System.out.println("\nEnter the book title you want: ");
					booknumber = scanner.next();
					 switch(booknumber) {
					 case "1":
						 bookTitle =" Nine Princes in Amber";
						 break;
					 case "2":
						 bookTitle ="Return of the King: Being the Third Part of the Lord of the Rings";
						 break;
					 case "3":
						 bookTitle ="Gardens of the Moon";
						 break;
					 };
		            reserveInfo = data.addReserve(rentDate,bookTitle, userName);
					System.out.println("\nHere is your reservation");
					System.out.println(reserveInfo + "\n");
					break;
				case "Romance": 
					for(int i = 9; i < 12; i++) {
			            System.out.println(list.get(i));
			        }
					System.out.println("\nEnter the book title you want: ");
					booknumber = scanner.next();
					 switch(booknumber) {
					 case "1":
						 bookTitle =" Heart Me";
						 break;
					 case "2":
						 bookTitle ="Never Again";
						 break;
					 case "3":
						 bookTitle ="Love of Tomorrow";
						 break;
					 };
		            reserveInfo = data.addReserve(rentDate,bookTitle, userName);
					System.out.println("\nHere is your reservation");
					System.out.println(reserveInfo + "\n");
				
					break;
					
				default:
					System.out.println("Invalid Option. Please try again.");
					break;
			}
	

	
		

		}
	}
	

}