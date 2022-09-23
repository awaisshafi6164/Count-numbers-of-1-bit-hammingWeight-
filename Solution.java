//This solution is running correctly but it takes more time as compared to soltuin2.java file.

public class Solution {
	public int hammingWeight(int n) {
		String str;
		str = Integer.toBinaryString(n);
		
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			char index = str.charAt(i);
			if(index == '1') {
				count++;
			}
		}
		return count;     
	}
}
