package crt_J5;

public class PrimeNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1,k=0;i<100;i++) {
			int num=i;
			int counter=0;
			for(int p=1;p<=num;p++) {
				if(num%p==0) counter++;
			}//for p
			if(counter==2) {
				System.out.print(num+" ");
				k++;
				if(k==6) {
					System.out.println();
					k=0;
				}
			}
		}

	}

}
