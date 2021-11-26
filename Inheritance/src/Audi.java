import java.time.LocalDate;

public class Audi extends Koli implements ReturnInterface, CarsWarranty {
	
	public String paket = "S-line";
	public String drive = "Quattro all-wheel drive";
	
	@Override
	public String returnInter() {
		return "If you have to return this car it can be returned in less than 20 days";
	}

	@Override
	public void carWarrantyStartDate() {
		LocalDate date = LocalDate.now();
		System.out.println("The warranty for this car starts " + date + ". And it expires in 4 years or 100.000km! Whichever occurs first! ");
		
	}

	@Override
	public void carWarrantyRules() {
		System.out.println("The Audi manufacturer warranty covers the following:\r\n"
				+ "\r\n"
				+ "The repair or replacement (subject to the approval of the Audi Centre) of defective parts according to technical requirements determined by the manufacturer. \r\n"
				+ "The repair of any standard components which have been damaged as a result of a manufacturing defect.\r\n"
				+ "Labour and repair costs at any Audi Centre. If you have modified your vehicle, the Audi Centre reserves the right to charge you for any extra work which results from this, for example, if a tow-bar has been fitted after manufacture that needs to be removed and refitted. \r\n"
				+ "Your warranty applies to the base vehicle only. It does not cover any special fittings, conversions or additional bodywork.\r\n"
				+ "If you discover a defect with your car, you need to report it to an Audi Centre as soon as you discover it, and you need to do so within your warranty period.\r\n"
				+ "\r\n"
				+ "On top of the standard warranty, all new Audi models come with three years’ complimentary roadside assistance.");
		
	}

	@Override
	public void carWarrantyExtension() {
		System.out.println("The extended warranty price is 8000$, and it tasts 10 years or 200.000km! Whichever occurs first!");
	}

}
