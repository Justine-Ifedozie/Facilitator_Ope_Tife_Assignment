public class Grocery{
 public static void main(String[] args){
groceryStore houstonStore = new groceryStore();
 groceryStore seattleStore = new groceryStore();
  groceryStore orlandoStore = new groceryStore();
 
double houstonAppleGrossRevenue, houstonOrangesGrossRevenue, houstonStoreGrossRevenue;

double seattleStoreGrossRevenue, orlandoStoreGrossRevenue;


houstonStore.ApplesSoldYearly = 534;
houstonStore.retailPriceOfApples = 0.99;
houstonStore.OrangesSoldYearly = 429;
houstonStore.retailPriceOfOranges = 0.87; 

seattleStore.ApplesSoldYearly = 765;
seattleStore.retailPriceOfApples = 0.86;
seattleStore.OrangesSoldYearly = 842;
seattleStore.retailPriceOfOranges = 0.91;

orlandoStore.ApplesSoldYearly = 402;
orlandoStore.retailPriceOfApples = 0.77;
orlandoStore.OrangesSoldYearly = 398;
orlandoStore.retailPriceOfOranges = 0.79;

houstonAppleGrossRevenue = houstonStore.ApplesSoldYearly * houstonStore.retailPriceOfApples;
houstonOrangesGrossRevenue = houstonStore.OrangesSoldYearly * houstonStore.retailPriceOfOranges;
 houstonStoreGrossRevenue = houstonAppleGrossRevenue + houstonOrangesGrossRevenue;

System.out.println("Houston Store");
System.out.println("Apples Sold - " + houstonStore.ApplesSoldYearly + "\nApple retail price: " + houstonStore.retailPriceOfApples + "\n\nOranges Sold - " + houstonStore.OrangesSoldYearly + "\nOrange retail price: " + houstonStore.retailPriceOfOranges);
System.out.println("\nYearly Gross Revenue: $" + houstonStoreGrossRevenue);


seattleStoreGrossRevenue = (seattleStore.ApplesSoldYearly * seattleStore.retailPriceOfApples)
+ (seattleStore.OrangesSoldYearly * seattleStore.retailPriceOfOranges);
System.out.println("\nSeattle Store Yearly Gross Revenue: $" + seattleStoreGrossRevenue);


orlandoStoreGrossRevenue = (orlandoStore.ApplesSoldYearly * orlandoStore.retailPriceOfApples)
+ (orlandoStore.OrangesSoldYearly * orlandoStore.retailPriceOfOranges);
System.out.println("\nOrlando Store Yearly Gross Revenue: $" + orlandoStoreGrossRevenue);

}
}

class groceryStore{
 int ApplesSoldYearly;
  double retailPriceOfApples;
   int OrangesSoldYearly;
    double retailPriceOfOranges;
}