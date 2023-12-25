abstract class vehicle
{
 int no of tyres;
 abstract void start()
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
  System.out.println("Scooter starts with key");
   } 
  public static void main(String[] args)
  {
   Car cr=new Car();
   cr.start();
   scooter sc=new scooter();
   sc.start();
  }
}
  
   