package crt_J5;

public class PrimeNum4 {
	public static void main(String[] args) {
		for(int i=1,m=0;i<100;i++) {
			int num=i;
			int counter=0;
			for(int p=1;p<=num;p++) {
				if(num%p==0) counter++;
			}
			if(counter==2) {
				m++;
				if(m==12) 
					System.out.print("the no.of 12 place is"+i);
		}

	}
}
}

	




				