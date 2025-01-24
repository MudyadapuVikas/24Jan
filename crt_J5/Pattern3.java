package crt_J5;

public class Pattern3 {

	public static void main(String[] args) {
		for(int i=1,sp=10;i<=5;i++) {
			for(int k=1;k<sp;k++) {
			System.out.print(" ");
		}
		sp=sp-1;
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
		System.out.println();
	}
}
}