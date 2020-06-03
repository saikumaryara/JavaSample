class PrintFormat{
	public static void main(String[] args){
		System.out.println(10);
		System.out.printf("%d\n",10);//formating the number with specified type
		System.out.println(10.5);
		System.out.printf("%f\n",10.5);
		System.out.println("a::"+10);
		System.out.printf("b::"+20);
		//System.out.println("%f",10); Here it throws Error IllegelFormat coversion
		System.out.printf("a::%d\n",10);
		System.out.printf("b::%f\n",20.0);
		System.out.println("a::"+10+"b::"+20);
		System.out.printf("a::%d b::%d",10,20);
	}
}