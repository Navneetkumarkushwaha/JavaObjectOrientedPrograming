class Ani
{
  void eat()
  {
   System.out.println("I am eating");
  }  
}
class Dog extends Ani
{
  public static void main(String args[])
  {
     Dog d=new Dog();
     d.eat();
   }
}
  