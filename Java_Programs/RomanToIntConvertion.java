package basics;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToIntConvertion {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String roNum=sc.next().toUpperCase();
	int res=romanToInt(roNum);

    if (res == -1) {
        System.out.println("Invalid Roman numeral input.");
    } else {
        System.out.println("Integer equivalent: " + res);
    }
    sc.close();
}

private static int romanToInt(String s) {
	HashMap<Character, Integer> romanVal= new HashMap<>();
	romanVal.put('I', 1);
	romanVal.put('V', 5);
	romanVal.put('X', 10);
	romanVal.put('L', 50);
	romanVal.put('C', 100);
	romanVal.put('D', 500);
	romanVal.put('M', 1000);
	int res=0;
	int prevVal=0;
	for(int i=s.length()-1; i>=0; i--) {
		int currentVal=romanVal.get(s.charAt(i));
		if(currentVal<prevVal) {
			res=res-currentVal;
		}
		else {
			res=res+currentVal;
		}
		prevVal=currentVal;
	}
	return res;
}
}
