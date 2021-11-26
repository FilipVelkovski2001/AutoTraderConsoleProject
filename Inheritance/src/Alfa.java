import java.time.LocalDate;

public class Alfa extends Koli implements ReturnInterface , CarsWarranty{

	public String paket = "quadrofoglio package";
	public String drive = "quadro drive";
	
	@Override
	public String returnInter() {
		
		return "You have to return this car in less than 15 days";
	}

	@Override
	public void carWarrantyStartDate() {
		LocalDate date = LocalDate.now();
		System.out.println("The warranty for this car starts " + date + ". And it expires in 4 years or 100.000km! Whichever occurs first! ");
		
	}

	@Override
	public void carWarrantyRules() {
		
		System.out.println("All FCA-brand vehicles can be covered by an extended warranty through Mopar®. Mopar is the parts manufacturer for FCA brands and offers two extended service contracts for Alfa Romeos: Maximum Care and Added Care Plus. \r\n"
				+ "\r\n"
				+ "Contract terms such as length, deductible, and final cost may vary by dealership and can be negotiable. The longest coverage terms last up to 8 years and 150,000 miles.\r\n"
				+ "\r\n"
				+ "The Maximum Care plan covers over 5,000 named components, such as the:\r\n"
				+ "\r\n"
				+ "Engine\r\n"
				+ "Transmission\r\n"
				+ "Driveline\r\n"
				+ "Steering\r\n"
				+ "Air conditioning\r\n"
				+ "Engine cooling system\r\n"
				+ "Fuel system\r\n"
				+ "Electrical components\r\n"
				+ "Front and rear suspension\r\n"
				+ "Brakes\r\n"
				+ "Instrumentation\r\n"
				+ "Power components\r\n"
				+ "Luxury components\r\n"
				+ "Body mechanisms\r\n"
				+ "Manual interior mechanisms\r\n"
				+ "Safety and security systems\r\n"
				+ "The Added Care Plus coverage is less extensive and includes only the most important systems, such as the:\r\n"
				+ "\r\n"
				+ "Engine\r\n"
				+ "Transmission\r\n"
				+ "Front- and rear-wheel drive\r\n"
				+ "Steering\r\n"
				+ "Air conditioning\r\n"
				+ "Brakes\r\n"
				+ "Suspension\r\n"
				+ "Electrical components");
	
	}

	@Override
	public void carWarrantyExtension() {
		System.out.println("The extended warranty price is 8000$, and it tasts 10 years or 200.000km! Whichever occurs first!");
		
	}

	
	
}
