package java2018;

public class duplicateChars {

	 public static void main(String argu[]) {

		  String str = "sandeep";
		  int cnt = 0;
		  char[] chnge = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (chnge[i] == chnge[j]) {
		     System.out.println(chnge[j]);
		     cnt++;
		     break;
		    }
		   }
		  }
		 }
		}