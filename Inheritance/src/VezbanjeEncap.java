import java.util.Scanner;

public class VezbanjeEncap {
	private String username;
	private String password;
	
	
	public void setUserName (String username) {
		this.username = username;
			
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void loginAccount() {
		
		System.out.println("Login to your account!");
		
		Scanner scanner1 = new Scanner(System.in);
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Enter your username:");
				
				while(!scanner.nextLine().equals(this.username)) {
					
					System.err.println("Please enter correct username!");
					
					
				}
				
				if( username == this.username) {
					System.out.println("Correct username!");
					
					System.out.println("Enter your password:");
					
					
					while(!scanner.nextLine().equals(this.password)) {
						
						System.err.println("Incorrect password!");
						
						}
					
					if(password == this.password) {
					System.out.println("Correct password!");
					System.out.println("Welcome to your account!");
					
					}
					
					else  {	
					
				while(this.password != scanner.nextLine()) {
					
					System.err.println("Incorrect password!");
					
					}
				}
				
				}
				
				
				else { 
					
					System.err.println("Incorrect info!");
					
					
				}
	}
	
	}




