abstract class vehicle
{
 int no_of_tyres;
 abstract void start();
}
class scooter extends vehicle
{
   void start()
   {
    System.out.println("Scooter starts with key");
   }
}
class car  extends vehicle
{
  void start()
  {
  System.out.println("Car starts with key");
   } 
  public static void main(String[] args)
  {
   car cr=new car();
   cr.start();
   scooter sc=new scooter();
   sc.start();
  }
}
  
   