interface I1
{ 
  void show();
} 
interface I2
{ 
 void display();
} 
class test0 implements I1,I2
{ 
 public void show()
 {
  System.out.println("1");
 }
 public void display()
 {
  System.out.println("2");
 }
 public static void main(String[] args)
 {
  test0 t=new test0();
  t.show();
  t.display();
 }
}