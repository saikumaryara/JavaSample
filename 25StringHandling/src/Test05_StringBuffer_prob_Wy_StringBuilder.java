
public class Test05_StringBuffer_prob_Wy_StringBuilder {
	public static void main(String[] args) {
	StringBuffer sb1=new StringBuffer();//In single thread model StringBuffer not recommond
	StringBuilder sb2=new StringBuilder();//use SBuuilder in SL Model
	long time1,time2;
	time1=System.nanoTime();
	for(int i=0;i<10000000;i++) {
		sb1.append(new Integer(i));//Here lock appllied every time becoz SBuffer is Syncronized
	}
	time2=System.nanoTime();
	System.out.println(time2-time1);
	time1=System.nanoTime();
	for(int i=0;i<10000000;i++) {
		sb2.append(new Integer(i));//StringBuilder take less time bocoz its not syncronized
	}
	time2=System.nanoTime();
	System.out.println(time2-time1);
	}
}
