package JavaPrograms;

public class Array1 {

	public static void main(String[] args) {
		
			int a [][] = {{0,1,2,3,4,5},
						  {0,11,22,33,44,55}, 
						  {10,9,8,7,6,5}};

			for(int i=0; i<=2; i++) {
				for (int j=0; j<=5; j++) {
				System.out.print(a[i][j]+" ");
					}
				System.out.println();
				}
			
	}

}
