package patterns;
/*  1
 *  0 1
 *  1 0 1
 *  0 1 0 1
 *  1 0 1 0 1
 */

public class ZeroOneTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;  //no.of rows
for(int i=1; i<=n; i++) {
    for(int j=1; j<=i; j++) {
        if((i+j) % 2 == 0) {
            System.out.print(1+" ");
        } else {
            System.out.print(0+" ");
        }
    }
    System.out.println();
}


for (int i=1; i<=n; i++) {
	for (int j=1; j<=i; j++) {
		int sum =i+j;
		if (sum%2==0) {
			System.out.print(1+" ");
			} else {
       System.out.print(0+" ");
		}
	}
	System.out.println();
}

	}

}
