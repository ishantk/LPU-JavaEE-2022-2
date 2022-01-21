
public class MultiDimensioanlArrays {

	public static void main(String[] args) {
		
		int[] usaCases = {635462, 73544521, 41324};
		int[] indiaCases = {454643, 6253432, 88781};
		int[] ukCases = {88734, 23909, 275345};
		
		// Multi Dimensional Arrays
		// Array of Arrays -> 2D
		int[][] worldCases = {
					//     0        1        2
						{635462, 73544521, 41324},	// 0
						{454643, 6253432, 88781},	// 1	
						{88734, 23909, 275345},		// 2
						{234234, 7878, 78876, 3465263, 8787},		// 3
						{8812334, 32434, 90936, 2635}		// 4
				  };
		
		System.out.println("worldCases is: "+worldCases);
		System.out.println("length of worldCases is: "+worldCases.length);
		
		System.out.println();
		
		for(int i=0;i<worldCases.length;i++) {
			System.out.println("worldCases["+i+"] is: "+worldCases[i]);
			System.out.println("length of worldCases["+i+"] is: "+worldCases[i].length);
			System.out.println();
		}
		
	
		// Looping in 2D Array
		for(int i=0;i<worldCases.length;i++) { // i: 0, 1, 2, 3, 4
			for(int j=0;j<worldCases[i].length;j++) {
				System.out.print(worldCases[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		// Enhanced For Loop on 2D Arrays
		for(int[] array : worldCases) {
			for(int element : array) {
				System.out.print(element+"  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//int[][] array2D = new int[5][4]; // 5 1d arrays with 4 elements each
		//array2D[1][1] = 1;
		
		int[][] array2D = new int[5][]; // 5 1-d arrays, but size in each array is not known as of now
		array2D[0] = new int[5]; // 0th array with 5 elements
		array2D[1] = new int[8];
		array2D[2] = new int[12];
		array2D[3] = new int[2];
		array2D[4] = new int[9]; // 4th index array with 9 elements
		
		array2D[1][1] = 1;
		
		for(int[] array : array2D) {
			for(int element : array) {
				System.out.print(element+"  ");
			}
			System.out.println();
		}
		
		
		
		int[][]a, b[];
		
		a = new int[3][3];    // 2d array
		b = new int[5][2][1]; // 3d array :)
		
		// 3D Array
		int[][][] array3D = {
				
								{
									{1, 2, 3},
									{4, 5, 6}
								},
								
								{
									{7, 8, 9},
									{10, 11, 12}
								}
				
						  };
		
	}

}
