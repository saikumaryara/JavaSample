//Develop a program
class Mobile {
	String ram;
	String rom;
	String camera;
	String screen_size;
	double price;
}
class MobileTest_01{
	public static void main(String[] args){
  Mobile apple=new Mobile();
  Mobile hauwai=new Mobile();
  System.out.println();
  apple.ram="4GB";
  apple.rom="64GB";
  apple.camera="16MP";
  apple.screen_size="5.5 inch";
  apple.price=56000.0;
    System.out.println();
  hauwai.ram="6GB";
  hauwai.rom="64GB";
  hauwai.camera="8MP";
  hauwai.screen_size="5.8 inch";
  hauwai.price=40000.0;
}
}
