package crt_J5;

public class PrimeNom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num =31,counter=0;
	for(int i=num;i>=1;i--){
	if(num%i==0) counter++;
	}
	if(counter ==2) {
		System.out.println("yes it is prime");
	}
	else {
		System.out.println("not a prime");
	}

	}

}
