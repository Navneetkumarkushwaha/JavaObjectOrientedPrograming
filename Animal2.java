class Animal2
{
 String color;
 int age;
 void initobj(String c,int a)
 {
  color=c;
  age=a;
 }
 public static void main(String[] args)
 {
  Animal2 aa=new Animal2();
  aa.initobj("black",10);
  aa.display();
 }
 void display()
 {
  System.out.println(color+" "+age);
 }
}