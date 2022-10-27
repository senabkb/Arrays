package dersdort;

public class TersArray {

	public static void main(String[] args) {
		
		int[] array= {32,27,64,18,95,14,90,70,60,37};
		System.out.printf("%s%8s%n","Index","Value");
		for(int counter=0;counter<array.length;counter++) {
			int tmp;
		 tmp=array[9-counter];
		 
			System.out.printf("%d\t",tmp);
			
			
		}
		
		
	}

}
