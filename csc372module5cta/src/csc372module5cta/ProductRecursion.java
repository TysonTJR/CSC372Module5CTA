package csc372module5cta;

public class ProductRecursion {
	
	
	
	int[] num = new int[5];
	

	
	
	public ProductRecursion (int firstUserInput, int secondUserInput, int thirdUserInput, int fourthUserInput, int fithUserInput) {
		num[0] = firstUserInput;
		num[1] = secondUserInput;
		num[2] = thirdUserInput;
		num[3] = fourthUserInput;
		num[4] = fithUserInput;
		
		
	}
	
	public int recursiveMethod(int a) {
	
		
		if(a == -1){
			return 1;
			
		}else 
			return num[a] * recursiveMethod(a-1);
			
		}
	
}
	
	
	

	

