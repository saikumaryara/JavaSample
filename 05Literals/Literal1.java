class Literal1{
  int i=10;
  double d=10.0;
  float f=10.f;
  char c='S';
  String str="saikumar";
  public static void main(String[] args){
	  Literal1 l1=new Literal1();//if variables are non-static create obj
    System.out.println(l1.i);
    System.out.println(l1.d);
    System.out.println(l1.f);
    System.out.println(l1.c);
    System.out.println(l1.str);
  }
}