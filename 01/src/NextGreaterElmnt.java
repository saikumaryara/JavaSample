
public class NextGreaterElmnt {

      public static int[] findNextGreaterElements(int[] num) {
		
		int next, i, j;
        for (i=0; i<4; i++)
        {
            next = -1;
            for (j = i+1; j<4; j++)
            {
                if (num[i] < num[j])
                {
                    next = num[j];
                    break;
                }
            }
             System.out.println(num[i]+" -- "+next);
	    }
		return num;
}
	public static void main(String[] args) {

		int[] a= {4,7,2,3};
		findNextGreaterElements(a);
	}

}
