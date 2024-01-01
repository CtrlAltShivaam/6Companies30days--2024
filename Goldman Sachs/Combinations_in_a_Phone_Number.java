import java.util.*;

public class Combinations_in_a_Phone_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution sol=new Solution();

        System.out.println("Enter a digit: ");
        String s=sc.nextLine();

        System.out.println(sol.letterCombinations(s));

    }
}

class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
		if(digits.isEmpty()) 
            return ans;
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
		for(int i =0; i<digits.length();i++){
			int x = Character.getNumericValue(digits.charAt(i));
			while(ans.peek().length()==i){
				String t = ans.remove();
				for(char s : mapping[x].toCharArray())
					ans.add(t+s);
			}
		}
		return ans;
    }
}