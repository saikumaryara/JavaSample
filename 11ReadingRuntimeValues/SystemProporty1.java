class SystemProporty1 
{
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(System.getProperty("eno"));
		String str=System.getProperty("ename");
		System.out.println(+a+" "+str);
	}
}
