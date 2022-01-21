
public class AssignmentOnArrays {

	public static void main(String[] args) {
		
		int[] pixel1 = {255, 0, 0}; // red :)
		int[] pixel2 = {123, 76, 44};
		int[] pixel3 = {32, 120, 0};
		int[] pixel4 = {123, 12, 120};
		int[] pixel5 = {189, 18, 0};
		int[] pixel6 = {187, 56, 130};
		int[] pixel7 = {140, 76, 120};
		int[] pixel8 = {90, 123, 90};
		int[] pixel9 = {200, 145, 105};
		
		// Image is an Array -> 3D
		int[][][] image = {
						{pixel1, pixel2, pixel3},
						{pixel4, pixel5, pixel6},
						{pixel7, pixel8, pixel9}
					};
		
		// Assignment 1: Rotate the Pixels to the Right by 90 degree :)
		//			  2: Rotate the Pixels to the Left by 180 degrees
		//			  3: Grayscale the image -> eg: pixel1 = {255, 0, 0};
		//					we will add 255+0+0/3 -> 85
		//					now pixel1 will be -> {85, 85, 85}, so d it for all the pixels

	}

}
