import java.time.LocalDate;

public class Bmw extends Koli implements ReturnInterface, CarsWarranty {
	
     public String paket = "M-pack";
	 public String drive = "Rear-wheel drive";
	 
	 @Override
	 public String returnInter() {
		return "If you want to return this car you have to return this car in less than 10 days";
		 
	 }

	@Override
	public void carWarrantyStartDate() {
		LocalDate date = LocalDate.now();
		System.out.println("The warranty for this car starts " + date + ". And it expires in 4 years or 100.000km! Whichever occurs first! ");
		
	}
		
	

	@Override
	public void carWarrantyRules() {
		System.out.println("When you purchase a new vehicle from BMW, you are protected against defects in materials or workmanship that originated at the factory. This warranty period starts on the sale date of the new vehicle, and lasts for 4 years or 100,000 km, "
		+ "whichever occurs first. If you encounter issues with your new BMW, make an appointment with our authorized BMW service center today so we can help to diagnose the problem. Other factory warranties provide coverage over additional rust perforation, emission components, and safety belts.");
		
	}

	@Override
	public void carWarrantyExtension() {
		
			System.out.println("The extended warranty price is 8000$, and it tasts 10 years or 200.000km! Whichever occurs first!");
		

	}
	 

	
	
}
