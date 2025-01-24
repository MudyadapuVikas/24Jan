package crt_J5;

public class PrimeSele {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			int num=i;
			int counter=0;
			for(int p=1;p<=num;p++) {
				if(num%p==0) counter++;
			}
			if(counter==2) {
				if(i%10==3 || i/10==3)
					System.out.println(i);
		}

	}
}
}
