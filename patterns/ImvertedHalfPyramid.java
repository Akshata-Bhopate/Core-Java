package patterns;
/*  
       *
     * * 
   * * *
 * * * *    */
public class ImvertedHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=4;
for (int i = 1; i <=a; i++) {
	for (int j = 1; j <=a-i; j++) {  //Space Print
		System.out.print("  ");
	}
	for (int k = 1; k <=i; k++) {
		System.out.print(" *"); 
	}
	System.out.println();
}
	}

}
