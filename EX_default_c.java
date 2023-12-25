class perimeter
{
 int length;
 int width;
perimeter()
 {
  length=0;
  width=0;
 }
perimeter(int x,int y)
{
 length=x;
 width=y; 
 }
 void cal_perimeter()
 {
  int peri;
  peri=2*(length+width);
   System.out.println("  kjcjhfbdv d"+" "+peri);
 } 
}
class EX_default_c
{
 public static void main(String[] args)
 {
  perimeter p1=new perimeter();
  perimeter p2=new perimeter(10,20);
  p1.cal_perimeter();
  p2.cal_perimeter();
 }
}
 