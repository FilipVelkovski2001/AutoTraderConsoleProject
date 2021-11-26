import java.time.LocalDate;

public class Tesla extends Koli implements ReturnInterface, CarsWarranty {
	
	 public String paket = "Roadster-pack";
	 public String drive = "Front-wheel drive";
	 
	@Override
	public String returnInter() {
		
		return "If you want to return this car you have to return this car in less than 20 days";
	}

	@Override
	public void carWarrantyStartDate() {
		LocalDate date = LocalDate.now();
		System.out.println("The warranty for this car starts " + date + ". And it expires in 4 years or 100.000km! Whichever occurs first! ");
	}

	@Override
	public void carWarrantyRules() {
		System.out.println("ortunately for owners, Tesla does provide decent protection under its New Vehicle Limited Warranty. All new Teslas come with a 4-year/50,000 mile bumper-to-bumper Basic Vehicle Limited warranty. "
				+ "This warranty will cover most repairs during the covered time period, with only a few exclusions. "
				+ "Tesla’s Battery and Drive Units are covered by separate, more extensive warranties. They vary by model, with the premium Model S and Model X getting more miles of protection. The more budget-friendly Model 3 and Model Y are covered by shorter warranties.\r\n"
				+ "\r\n"
				+ "Previously, Tesla had unlimited-mileage warranties for the battery and drive unit. Now, however, there are mileage limits.\r\n"
				+ "\r\n"
				+ "Model S/Model X Warranty: These models are covered by an 8-year/150,000-mile warranty, whichever comes first.\r\n"
				+ "Model Y/Model 3 Short Range Warranty: The short-range variants of these models are covered for 8 years/100,000 miles.\r\n"
				+ "Model Y/Model 3 Long Range Warranty: The long-range variants are covered for 8 years/120,000 miles.\r\n"
				+ "In addition, Tesla guarantees 70 percent battery retention during the covered period. If battery retention drops below this level, Tesla will replace your battery. This was something new in 2020.\r\n"
				+ "\r\n"
				+ "Tesla provides separate warranty coverage terms for certain other parts and conditions:\r\n"
				+ "\r\n"
				+ "Supplemental Restraint System (SRS) Warranty: This covers repairs or replacements to correct defects in seatbelts and airbags for up to 5 years/60,000 miles.\r\n"
				+ "Body Rust Limited Warranty: This covers rust perforation, which occurs when a hole is formed inside outwards due to rusting for up to 12 years/unlimited miles.\r\n"
				+ "The above warranties cover costs associated with the repairs to correct defects in any parts that were manufactured or supplied by Tesla, which occur under normal use. Craftsmanship defects are also covered.\r\n"
				+ "\r\n"
				+ "These warranties are transferable at no additional cost. If you buy a used Tesla directly from the company, you’ll receive additional coverage, which we’ll cover shortly.");
		
	}

	@Override
	public void carWarrantyExtension() {
		System.out.println("The extended warranty price is 8000$, and it tasts 10 years or 200.000km! Whichever occurs first!");
		
	}

}
