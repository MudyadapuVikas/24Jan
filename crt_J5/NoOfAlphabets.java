package crt_J5;

public class NoOfAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="wedftgvhujkopkjhnjhgfghytf";
		int[] count=new int[26];
		for(int i=0;i<data.length();i++) {
			char ch=data.charAt(i);
			count[ch-97]++;
			if(ch=='a') {
				count[1]++;
			}
			
			if(ch=='b') {
				count[2]++;
			}
			
			if(ch=='c') {
				count[3]++;
			}
			
			if(ch=='d') {
				count[4]++;
			}
			
			if(ch=='e') {
				count[5]++;
			}
			if(ch=='f') {
				count[6]++;
			}
			
			if(ch=='g') {
				count[7]++;
			}
			if(ch=='h') {
				count[8]++;
			}
			
			if(ch=='i') {
				count[9]++;
			}
			
			if(ch=='j') {
				count[10]++;
			}
			if(ch=='k') {
				count[11]++;
			}
			if(ch=='l') {
				count[12]++;
			}
			if(ch=='m') {
				count[13]++;
			}
			if(ch=='n') {
				count[14]++;
			}
			if(ch=='o') {
				count[15]++;
			}
			if(ch=='p') {
				count[16]++;
			}
			if(ch=='q') {
				count[17]++;
			}
			if(ch=='r') {
				count[18]++;
			}
			if(ch=='s') {
				count[19]++;
			}
			if(ch=='t') {
				count[20]++;
			}
			if(ch=='u') {
				count[21]++;
			}
			if(ch=='v') {
				count[22]++;
			}
			if(ch=='w') {
				count[23]++;
			}
			if(ch=='x') {
				count[24]++;
			}
			if(ch=='y') {
				count[25]++;
			}
			if(ch=='z') {
				count[26]++;
			}
		}
		for(int i=0;i<=26;i++) {
			System.out.println((char)(i+97)+"------>"+count[i]);
		}

	}

}
