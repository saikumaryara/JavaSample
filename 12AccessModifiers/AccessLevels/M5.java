class M5//defalut AM ---> is default 
{
	int x=10;
	void m1(){}//for these 3 lines defalut AM ---> is default   cmd>>javap M5
	M5(){}
}
interface I//defalut AM ---> is default
{
	int x=10;//defalut AM ---> is public    cmd>>javap I
	void m1();//defalut AM ---> is public    cmd>>javap I
}
@interface Ann{//defalut AM ---> is default
int x=10;//defalut AM ---> is public
String m1();//defalut AM ---> is public  cmd>>javap Ann
}
enum E{//defalut AM ---> is default
A,B//Ncs
	;
int x=10;//defalut AM ---> is default
void m1(){}//defalut AM ---> is default
E(){}
}//defalut AM ---> is private