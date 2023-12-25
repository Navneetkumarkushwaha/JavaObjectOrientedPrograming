class A
{ 
  void showA()
  {
   System.out.println("A class Method");
  }
}
class B extends A
{
 void showB()
 {
  System.out.println("B class Method");
 }
}
class C extends B
{
  void showC()
  {
   System.out.println("C class Method");
  }
  {
  public Static void main(String[] args)
    A ob1=new A();
    ob1.ShowA();
    B ob2=new B();
    ob2.ShowA();
    ob2.ShowB();
    C ob3=new C();
    ob3.showA();
    ob3.ShowB();
    ob3.ShowC();
  }
}