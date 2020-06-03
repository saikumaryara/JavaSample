/* Types of integral         base   Allowed Digits                                      Identity
  *BINARY                     2        0/1                                               start with 0B/0b following by 0/1 only
  *OCTAL                      8        0-7                                               start with 0 following by 0-7
  *DECIMAL                    10       0-9                                               not start with 0 following by 0-9
  *HEXADECIMAL                16       0-9ABCDEF/abcdef ->A/10,B/11,C/12,D/13,E/14,F/15  start with 0X/0x following by 0-9ABCDEF
*/
class NumberSystem{
    public static void main(String []args){
	System.out.println("Hello JAVA WORLD");
	System.out.println(1010);//decimal value directly print as it is 1010 
	System.out.println(0xA1);//hexa value cnvrt to decimal aand print A*16^1+1*16^0=-->>10*16^1+1*16^0
	System.out.println(0b1110);//binary value cnvrt to decimal and print 1*1^3+1*1^2+1*1^2+0*1^0
	System.out.println(0b1011010);//binary value cnvrt to decimal and print 
	System.out.println(0237L);
	System.out.println(0123.0);
	System.out.println(0123F);
	System.out.println(0123D);
		System.out.println(0123.0F);
	System.out.println(0123.0D);
	System.out.println(5_00_000);
	}
}