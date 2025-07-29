import java.util.*;


class AnagramString{
	public static void main(String[] args) {
		String str1="listen";
		String str2="silent";

		char[]w1=str1.toCharArray();
		char[]w2=str2.toCharArray();

		Arrays.sort(w1);
		Arrays.sort(w2);

		if(Arrays.equals(w1,w2)){
			System.out.println("AnagramString");
		
		
		}
		else{
			System.out.println("not AnagramString");
		}

	



	}
}
