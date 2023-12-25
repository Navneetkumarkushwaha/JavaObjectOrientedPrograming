class Test2
{
  int i;
  void setValue(int i)
  {
   this.i=i;
  }
  void show()
  {
   System.out.println(i);
  }
}
class xyz
{
  public static void main(String[] args)
  {
   Test2 t=new Test2();
   t.setValue(10);
   t.show();
  }
}