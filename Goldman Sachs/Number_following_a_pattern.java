import java.util.Scanner;
import java.util.Stack;

public class Number_following_a_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a pattern containing only I's and D's: ");
        String S =sc.nextLine();
        GFG g=new GFG();
        System.out.println("The minimum number following that pattern: "+ g.printMinNumberForPattern(S));
    }
}
class GFG{
    static String printMinNumberForPattern(String S){
        if (S.isEmpty()) {
            return "";
        }

        // code here
        S+='I';
        String ans="";
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=S.length()-1;i++){
            st.push(i+1);
            
            if(S.charAt(i)=='I'){
                while(!st.empty()){
                    ans+=st.pop();
                }
            }
        }
        return ans;
    }
}
