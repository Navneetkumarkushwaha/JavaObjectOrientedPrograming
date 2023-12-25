class A
{
 A()
   {
    System.out.println("Class A");
   }
}
class B extends A
{
  B()
  {
   System.out.println("class B");
  }
}
class C extends B
{  
  C()
  {
    System.out.println("class c");
  }
}
class OrderOfConstruction
{
  public static void main(String[] args)
  {
   C c=new C();
   }
}