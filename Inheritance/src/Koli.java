
public class Koli {
   private int hp;
   private int year;
   public int price;
   private String gas;
   String model;
   
   public void setSpecs(String model, int hp, int year, int price, String gas) {
	   
	   this.hp = hp;
	   this.year = year;
	   this.price = price;
	   this.gas = gas;
	   this.model = model;
	   
   }
   
   
   
   public void getSpecs(){
	   
	   System.out.println(this.model);
	   System.out.println("The model year is: "+ this.year);
	   System.out.println("The price is: "+ this.price);
	   System.out.println("The car's horse power is: "+ this.hp);
	   System.out.println("The car's gas is : "+ this.gas);
	   
   }
	
	
}
