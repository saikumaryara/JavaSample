class MultipleCatchBlocksRule 
{
	public static void main(String[] args) 
	{
		try{
		}
		catch(ArrayIndexOutOfBoundsException e){
		}
		/*
		 * catch(ArrayIndexOutOfBoundsException e){ }
		 */

		try{
		}
		catch(Exception e){
		}
		/*
		 * catch(ArrayIndexOutOfBoundsException e){ }
		 */
	
	}
}
