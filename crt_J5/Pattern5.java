package crt_J5;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(((i+j)-1)%2+" ");
			}
			System.out.println();
		}
	}

}
