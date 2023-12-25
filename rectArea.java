class rectangle
{
   int length,width;
   void getdata(int x,int y)
   {
    length=x;
    width=y;
   }
   int rectArea()
   {
    int area=length*width;
    return(area);
   }
}
class rectArea extends rectangle
{
  public static void main(String[] args)
  {
   int area1,area2;
   Rectangle area1=new Rectangle();
   Rectangle area2=new Rectangle();
   area1.length=15;
   area1.width=10;
   area1=Rect1.length*Rect1.width;
   rect2.getdata(20,50);
   area2=area2.rectArea();
   System.out.println("Area1 ="+" "+area1);
   System.out.println("Area2 ="+" "+area2);
  }
}