package crt_J5;

public class PrimeNum5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100,m=0;i>=1;i--) {
			int num=i;
			int counter=0;
			for(int p=1;p<=num;p++) {
				if(num%p==0) counter++;
			}
			if(counter==2) {
				m++;
				if(m==1) 
					System.out.print("the last place is"+i);
		}

	}
}
}
