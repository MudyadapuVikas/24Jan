package crt_J5;

public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				if(i %10==6 || i/10==6) {
					System.out.print(i+" ");
				}
			}
		}
	}
}
