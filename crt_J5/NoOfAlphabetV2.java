package crt_J5;

public class NoOfAlphabetV2 {

	public static void main(String[] args) {
		String data="rtyhgbvcdfrtyuikjhb";
		int[] count=new int[26];
		for(int i=0;i<=data.length();i++) {
			char ch=data.charAt(i);
			count[ch-97]++;
		}
		for(int i=0;i<=26;i++) {
			System.out.println((char)(i+97)+"------>"+count[i]);
		}

	}

}
