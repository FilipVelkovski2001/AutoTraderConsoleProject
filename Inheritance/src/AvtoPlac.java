import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AvtoPlac {

	public static void main(String[] args) {
		
    System.out.println("Welcome to Autotrader");
		
		VezbanjeEncap encap1 = new VezbanjeEncap();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Create an account!");
		
		System.out.println("Create a username:");
		
		encap1.setUserName(scan.nextLine());
		
		System.out.println("Create a password:");
		
		encap1.setPassword(scan.nextLine());
		encap1.loginAccount();
		
		
		System.out.println(" ");
		
		System.out.println(" ");
		
		System.out.println("These are the cars available at the moment!");
		
		System.out.println(" ");
		
		Bmw bmw1 = new Bmw();
		bmw1.setSpecs("BMW 320D", 180, 2020, 75500, "Dizel");
		bmw1.getSpecs();
		System.out.println("This model's package is: "+ bmw1.paket);
		System.out.println("This model's drive wagon is: "+ bmw1.drive);
		
		System.out.println(" ");
		
		Audi audi1 = new Audi();
		audi1.setSpecs("Audi A4", 160, 2021, 65300, "Benzin");
		audi1.getSpecs();
		System.out.println("This model's package is: "+ audi1.paket);
		System.out.println("This model's drive wagon is: "+ audi1.drive);
		
        System.out.println(" ");
		
		Tesla tesla1 = new Tesla();
		tesla1.setSpecs("Tesla Roadster", 250, 2019, 77300, "Electric");
		tesla1.getSpecs();
		System.out.println("This model's package is: "+ tesla1.paket);
		System.out.println("This model's drive wagon is: "+ tesla1.drive);
		
		System.out.println("");
		
		Alfa alfa1 = new Alfa();
		alfa1.setSpecs("Alfa Romeo Giulia", 225, 2020, 80000, "Petrol");
		alfa1.getSpecs();
		System.out.println("This model's package is: "+ alfa1.paket);
		System.out.println("This model's drive wagon is: "+ alfa1.drive);
		
		System.out.println(" ");
		
		System.out.println("Chose the car you would like to buy!");
		
		Scanner scan1 = new Scanner(System.in);

		String cars[] = {tesla1.model, bmw1.model, audi1.model, alfa1.model};
		String car;
		car = scan1.nextLine();
		
		while(!car.equalsIgnoreCase(cars[0]) && !car.equalsIgnoreCase(cars[1]) && !car.equalsIgnoreCase(cars[2]) && !car.equalsIgnoreCase(cars[3])) {
			
			System.err.println("You have to choose the correct model!");
			car = scan1.nextLine();
			
		}
				
		
		
		if(car.equalsIgnoreCase(cars[0])){
			
			System.out.println("The price is " + tesla1.price + "$");
			System.out.println("How would you like to pay? Cash or Credit");
			Scanner scan2 = new Scanner(System.in);
			String choice;
			choice = scan2.nextLine();
			
			while(!choice.equalsIgnoreCase("Cash") & !choice.equalsIgnoreCase("Credit")) {
				System.err.println("You have to choose the correct payment method!");
				choice = scan2.nextLine();
				
			}
			
			if(choice.equalsIgnoreCase("Cash")) {
				System.out.println("Congratulations you just bought your first car from AutoTrader! "+ cars[0]);
				
				tesla1.carWarrantyStartDate();
				Scanner scan4 = new Scanner(System.in);
				String choice4;
				System.out.println("Would you like to know more about the warranty? Yes or No? ");
				choice4 = scan4.nextLine();
				
				
				while(!choice4.equalsIgnoreCase("yes") & !choice4.equalsIgnoreCase("no")) {
					System.err.println("You have to choose yes or no!");
					choice4 = scan.nextLine();
				}
				
				if(choice4.equalsIgnoreCase("yes")){
					tesla1.carWarrantyRules();
					System.out.println(" ");
					tesla1.carWarrantyExtension();
					System.out.println(" ");
					
				}
				else if(choice4.equalsIgnoreCase("no")) {
					
					System.out.println(" ");
				}
				
				System.out.println(tesla1.returnInter());
		
				
			}
			else if(choice.equals("Credit")) {
				
				System.out.println("Would you like to pay in 12 month rates or 24 month rates?");
				Scanner scan3 = new Scanner(System.in);
				String choice2;
				
				choice2 = scan3.nextLine();
				
				while(!choice2.equalsIgnoreCase("12") & !choice2.equalsIgnoreCase("24")) {
					
					System.err.println("You have to choose the correct method of payment!");
					choice2 = scan3.nextLine();
				}
				
				
				if(choice2.equalsIgnoreCase("12")) {
					System.out.println("Your monthly payment for 12 rates will be " + (tesla1.price / 12) + "$");
					System.out.println("Congratulations you just bought your first car from AutoTrader! "+ cars[0]);
					
					tesla1.carWarrantyStartDate();
					Scanner scan4 = new Scanner(System.in);
					String choice4;
					System.out.println("Would you like to know more about the warranty? Yes or No? ");
					choice4 = scan4.nextLine();
					
					
					while(!choice4.equalsIgnoreCase("yes") & !choice4.equalsIgnoreCase("no")) {
						System.err.println("You have to choose yes or no!");
						choice4 = scan.nextLine();
					}
					
					if(choice4.equalsIgnoreCase("yes")){
						tesla1.carWarrantyRules();
						System.out.println(" ");
						tesla1.carWarrantyExtension();
						System.out.println(" ");
						
					}
					else if(choice4.equalsIgnoreCase("no")) {
						
						System.out.println(" ");
					}
					
					System.out.println(tesla1.returnInter());
			
					
				}
				else if(choice2.equalsIgnoreCase("24")) {
					
					System.out.println("Your monthly payment for 24 rates will be " + (tesla1.price / 24) + "$");
					System.out.println("Congratulations you just bought your first car from AutoTrader!" + cars[0]);
					
					tesla1.carWarrantyStartDate();
					Scanner scan4 = new Scanner(System.in);
					String choice4;
					System.out.println("Would you like to know more about the warranty? Yes or No? ");
					choice4 = scan4.nextLine();
					
					
					while(!choice4.equalsIgnoreCase("yes") & !choice4.equalsIgnoreCase("no")) {
						System.err.println("You have to choose yes or no!");
						choice4 = scan.nextLine();
					}
					
					if(choice4.equalsIgnoreCase("yes")){
						tesla1.carWarrantyRules();
						System.out.println(" ");
						tesla1.carWarrantyExtension();
						System.out.println(" ");
						
					}
					else if(choice4.equalsIgnoreCase("no")) {
						
						System.out.println(" ");
					}
					
					System.out.println(tesla1.returnInter());
			
					
				}
				else {
					
					System.err.println("You have to choose a correct payment!");
					
				}
				
				
				
			}
			
		}
		
		else if(car.equalsIgnoreCase(cars[1])){
			
			System.out.println("The price is " + bmw1.price + "$");
			System.out.println("How would you like to pay? Cash or Credit");
			Scanner scan2 = new Scanner(System.in);
			String choice;
			choice = scan2.nextLine();
			while(!choice.equalsIgnoreCase("Cash") & !choice.equalsIgnoreCase("Credit")) {
				System.err.println("You have to choose the correct payment method!");
				choice = scan2.nextLine();
				
			}
			
			
			if(choice.equalsIgnoreCase("Cash")) {
				System.out.println("Congratulations you just bought your first car from AutoTrader! "+ cars[1]);
				
				bmw1.carWarrantyStartDate();
				Scanner scan4 = new Scanner(System.in);
				String choice4;
				System.out.println("Would you like to know more about the warranty? Yes or No? ");
				choice4 = scan4.nextLine();
				
				
				while(!choice4.equalsIgnoreCase("yes") & !choice4.equalsIgnoreCase("no")) {
					System.err.println("You have to choose yes or no!");
					choice4 = scan.nextLine();
				}
				
				if(choice4.equalsIgnoreCase("yes")){
					bmw1.carWarrantyRules();
					System.out.println(" ");
					bmw1.carWarrantyExtension();
					System.out.println(" ");
					
				}
				else if(choice4.equalsIgnoreCase("no")) {
					
					System.out.println(" ");
				}
				
				System.out.println(bmw1.returnInter());
		
				
			}
			else if(choice.equals("Credit")) {
				
				System.out.println("Would you like to pay in 12 month rates or 24 month rates?");
				Scanner scan3 = new Scanner(System.in);
				String choice2 = scan.nextLine();
				
                while(!choice2.equalsIgnoreCase("12") & !choice2.equalsIgnoreCase("24")) {
					
					System.err.println("You have to choose the correct method of payment!");
					choice2 = scan3.nextLine();
				}
				
				choice2 = scan3.nextLine();
				if(choice2.equalsIgnoreCase("12")) {
					System.out.println("Your monthly payment for 12 rates will be " + (bmw1.price / 12) + "$");
					System.out.println("Congratulations you just bought your first car from AutoTrader! "+ cars[1]);
					
					bmw1.carWarrantyStartDate();
					Scanner scan4 = new Scanner(System.in);
					String choice4;
					System.out.println("Would you like to know more about the warranty? Yes or No? ");
					choice4 = scan4.nextLine();
					
					
					while(!choice4.equalsIgnoreCase("yes") & !choice4.equalsIgnoreCase("no")) {
						System.err.println("You have to choose yes or no!");
						choice4 = scan.nextLine();
					}
					
					if(choice4.equalsIgnoreCase("yes")){
						bmw1.carWarrantyRules();
						System.out.println(" ");
						bmw1.carWarrantyExtension();
						System.out.println(" ");
						
					}
					else if(choice4.equalsIgnoreCase("no")) {
						
						System.out.println(" ");
					}
					
					System.out.println(bmw1.returnInter());
			
					
				}
				else if(choice2.equalsIgnoreCase("24")) {
					
					System.out.println("Your monthly payment for 24 rates will be " + (bmw1.price / 24) + "$");
					System.out.println("Congratulations you just bought your first car from AutoTrader!" + cars[1]);
					
					bmw1.carWarrantyStartDate();
					Scanner scan4 = new Scanner(System.in);
					String choice4;
					System.out.println("Would you like to know more about the warranty? Yes or No? ");
					choice4 = scan4.nextLine();
					
					
					while(!choice4.equalsIgnoreCase("yes") & !choice4.equalsIgnoreCase("no")) {
						System.err.println("You have to choose yes or no!");
						choice4 = scan.nextLine();
					}
					
					if(choice4.equalsIgnoreCase("yes")){
						bmw1.carWarrantyRules();
						System.out.println(" ");
						bmw1.carWarrantyExtension();
						System.out.println(" ");
						
					}
					else if(choice4.equalsIgnoreCase("no")) {
						
						System.out.println(" ");
					}
					
					System.out.println(bmw1.returnInter());
			
					
					
				}
				else {
					
					System.err.println("You have to choose a correct payment!");
					
				}
				
				
				
			}
		
	
	
	   }
		
		else if(car.equalsIgnoreCase(cars[3])) {
			
			
			System.out.println("The price is " + alfa1.price + "$");
			System.out.println("How would you like to pay? Cash or Credit");
			Scanner scan2 = new Scanner(System.in);
			String choice;
			choice = scan2.nextLine();
			while(!choice.equalsIgnoreCase("Cash") & !choice.equalsIgnoreCase("Credit")) {
				System.err.println("You have to choose the correct payment method!");
				choice = scan2.nextLine();
				
			}
			
			
			
			if(choice.equalsIgnoreCase("Cash")) {
				System.out.println("Congratulations you just bought your first car from AutoTrader! "+ cars[3]);
				
				alfa1.carWarrantyStartDate();
				Scanner scan4 = new Scanner(System.in);
				String choice4;
				System.out.println("Would you like to know more about the warranty? Yes or No? ");
				choice4 = scan4.nextLine();
				
				
				while(!choice4.equalsIgnoreCase("yes") & !choice4.equalsIgnoreCase("no")) {
					System.err.println("You have to choose yes or no!");
					choice4 = scan.nextLine();
				}
				
				if(choice4.equalsIgnoreCase("yes")){
					alfa1.carWarrantyRules();
					System.out.println(" ");
					alfa1.carWarrantyExtension();
					System.out.println(" ");
					
				}
				else if(choice4.equalsIgnoreCase("no")) {
					
					System.out.println(" ");
				}
				
				System.out.println(alfa1.returnInter());
		
				
			}
			
			else if(choice.equalsIgnoreCase("Credit")) {
				
				System.out.println("Would you like to pay in 12 month rates or 24 month rates?");
				Scanner scan3 = new Scanner(System.in);
                String choice2 = scan.nextLine();
				
                while(!choice2.equalsIgnoreCase("12") & !choice2.equalsIgnoreCase("24")) {
					
					System.err.println("You have to choose the correct method of payment!");
					choice2 = scan3.nextLine();
				}
				if(choice2.equals("12")) {
					System.out.println("Your monthly payment for 12 rates will be " + (alfa1.price / 12) + "$");
					System.out.println("Congratulations sir you just bought your first car from AutoTrader! "+ cars[3]);
					
					alfa1.carWarrantyStartDate();
					Scanner scan4 = new Scanner(System.in);
					String choice4;
					System.out.println("Would you like to know more about the warranty? Yes or No? ");
					choice4 = scan4.nextLine();
					
					
					while(!choice4.equalsIgnoreCase("yes") & !choice4.equalsIgnoreCase("no")) {
						System.err.println("You have to choose yes or no!");
						choice4 = scan.nextLine();
					}
					
					if(choice4.equalsIgnoreCase("yes")){
						alfa1.carWarrantyRules();
						System.out.println(" ");
						alfa1.carWarrantyExtension();
						System.out.println(" ");
						
					}
					else if(choice4.equalsIgnoreCase("no")) {
						
						System.out.println(" ");
					}
					
					System.out.println(alfa1.returnInter());
			
					
				}
				else if(choice2.equals("24")) {
					
					System.out.println("Your monthly payment for 24 rates will be " + (alfa1.price / 24) + "$");
					System.out.println("Congratulations sir you just bought your first car from AutoTrader!" + cars[3]);
					
					alfa1.carWarrantyStartDate();
					Scanner scan4 = new Scanner(System.in);
					String choice4;
					System.out.println("Would you like to know more about the warranty? Yes or No? ");
					choice4 = scan4.nextLine();
					
					
					while(!choice4.equalsIgnoreCase("yes") & !choice4.equalsIgnoreCase("no")) {
						System.err.println("You have to choose yes or no!");
						choice4 = scan.nextLine();
					}
					
					if(choice4.equalsIgnoreCase("yes")){
						alfa1.carWarrantyRules();
						System.out.println(" ");
						alfa1.carWarrantyExtension();
						System.out.println(" ");
						
					}
					else if(choice4.equalsIgnoreCase("no")) {
						
						System.out.println(" ");
					}
					
					System.out.println(alfa1.returnInter());
			
					
				}
				else {
					
					System.err.println("You have to choose a correct payment!");
					
				}
				
				
				
			}	
			
			
		}
		
		
		
       else if(car.equalsIgnoreCase(cars[2])){
			
			
			System.out.println("The price is " + audi1.price + "$");
			System.out.println("How would you like to pay? Cash or Credit");
			Scanner scan2 = new Scanner(System.in);
			String choice;
			choice = scan2.nextLine();
			while(!choice.equalsIgnoreCase("Cash") & !choice.equalsIgnoreCase("Credit")) {
				System.err.println("You have to choose the correct payment method!");
				choice = scan2.nextLine();
	
				
			}
			
			
			if(choice.equalsIgnoreCase("Cash")) {
				System.out.println("Congratulations you just bought your first car from AutoTrader! "+ cars[2]);
				
				audi1.carWarrantyStartDate();
				Scanner scan4 = new Scanner(System.in);
				String choice4;
				System.out.println("Would you like to know more about the warranty? Yes or No? ");
				choice4 = scan4.nextLine();
				
				
				while(!choice4.equalsIgnoreCase("yes") & !choice4.equalsIgnoreCase("no")) {
					System.err.println("You have to choose yes or no!");
					choice4 = scan.nextLine();
				}
				
				if(choice4.equalsIgnoreCase("yes")){
					audi1.carWarrantyRules();
					System.out.println(" ");
					audi1.carWarrantyExtension();
					System.out.println(" ");
					
				}
				else if(choice4.equalsIgnoreCase("no")) {
					
					System.out.println(" ");
				}
				
				System.out.println(audi1.returnInter());
		
				
			}
			
			else if(choice.equalsIgnoreCase("Credit")) {
				
				System.out.println("Would you like to pay in 12 month rates or 24 month rates?");
				Scanner scan3 = new Scanner(System.in);
                String choice2 = scan.nextLine();
				
                while(!choice2.equalsIgnoreCase("12") & !choice2.equalsIgnoreCase("24")) {
					
					System.err.println("You have to choose the correct method of payment!");
					choice2 = scan3.nextLine();
				}
                
				
				if(choice2.equalsIgnoreCase("12")) {
					System.out.println("Your monthly payment for 12 rates will be " + (audi1.price / 12) + "$");
					System.out.println("Congratulations sir you just bought your first car from AutoTrader! "+ cars[2]);
					
					audi1.carWarrantyStartDate();
					Scanner scan4 = new Scanner(System.in);
					String choice4;
					System.out.println("Would you like to know more about the warranty? Yes or No? ");
					choice4 = scan4.nextLine();
					
					
					while(!choice4.equalsIgnoreCase("yes") & !choice4.equalsIgnoreCase("no")) {
						System.err.println("You have to choose yes or no!");
						choice4 = scan.nextLine();
					}
					
					if(choice4.equalsIgnoreCase("yes")){
						audi1.carWarrantyRules();
						System.out.println(" ");
						audi1.carWarrantyExtension();
						System.out.println(" ");
						
					}
					else if(choice4.equalsIgnoreCase("no")) {
						
						System.out.println(" ");
					}
					
					System.out.println(audi1.returnInter());
			
					
				
				}
				else if(choice2.equals("24")) {
					
					System.out.println("Your monthly payment for 24 rates will be " + (audi1.price / 24) + "$");
					System.out.println("Congratulations sir you just bought your first car from AutoTrader!" + cars[2]);
					
					audi1.carWarrantyStartDate();
					Scanner scan4 = new Scanner(System.in);
					String choice4;
					System.out.println("Would you like to know more about the warranty? Yes or No? ");
					choice4 = scan4.nextLine();
					
					
					while(!choice4.equalsIgnoreCase("yes") & !choice4.equalsIgnoreCase("no")) {
						System.err.println("You have to choose yes or no!");
						choice4 = scan.nextLine();
					}
					
					if(choice4.equalsIgnoreCase("yes")){
						audi1.carWarrantyRules();
						System.out.println(" ");
						audi1.carWarrantyExtension();
						System.out.println(" ");
						
					}
					else if(choice4.equalsIgnoreCase("no")) {
						
						System.out.println(" ");
					}
					
					System.out.println(audi1.returnInter());
			
					
				}
					
					
				}
				else {
					
					System.err.println("You have to choose a correct payment!");
					
				}
				
				
				
			}
		
		System.out.println("The warranty will still last if you do the next things");
		
		String[] tunes = {"Exterior mods ","Stage 1 tune ", "Interior upgrades such as leather seats. "};
		ArrayList<String> tunesList = new ArrayList(Arrays.asList(tunes));
		
		tunesList.replaceAll(tunes1 -> tunes1.toUpperCase());
		
		System.out.println(tunesList);
		
		
	}
		
		
		
}
	


