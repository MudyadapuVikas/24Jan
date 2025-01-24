package crt_J5;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=15;i++) {
			for(int k=1;k<=17;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=30;j++) {
				if((i==1) || (i==15)) {
					System.out.print("*");
			} 
				else {
					if((j==1) || (j==30)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
		}System.out.println();
	}
	}
}
