public class Flycraft{
 public static void main(String[] args){
  aircraft boeing737 = new aircraft();

  aircraft nigerianAirline = new aircraft();
  
  double boeing737Endurance;  

  boeing737.passengers = 4;
  boeing737.cruiseSpeed = 140;
  boeing737.fuelCapacity = 56.5;
  boeing737.fuelBurnRate = 9.5;

  boeing737Endurance = boeing737.fuelCapacity / boeing737.fuelBurnRate;
 
System.out.print("A Boeing 737 can stay aloft for " + boeing737Endurance);
  nigerianAirline.passengers = 6;
  nigerianAirline.cruiseSpeed = 201;
  nigerianAirline.fuelCapacity = 102.5;
  nigerianAirline.fuelBurnRate = 20.5;

System.out.println("\nBoeing 737 passengers: " + boeing737.passengers);
}
}

class aircraft{
  int passengers;
  int cruiseSpeed;
  double fuelCapacity;
  double fuelBurnRate;

}