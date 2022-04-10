package day6;

public class CharOccurance {
	
public static void main(String[] args) {
		
		String str = "Welcome to chennai";
		char[] ch =str.toCharArray();
		int count =0;
		for(int i=0; i<str.length(); i++) {
			
			if(ch[i] == 'c')
			{
				++count;
			}
			
		}
		System.out.println("Number of occurance of c is "+count);
	}


}
