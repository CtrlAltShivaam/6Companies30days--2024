import java.util.Scanner;

public class Run_Length_Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
		String str = sc.nextLine();
		GfG g = new GfG();
		System.out.println("Encoded string: "+g.encode(str));
    }
}

class GfG
 {
	String encode(String str)
	{
          //Your code here
          char ch=str.charAt(0);
          int a=0;
          String s="";
          for(int i=0;i<str.length();i++){
              char c=str.charAt(i);
              if(c==ch){
                  a+=1;
              } else {
                  s+=ch;
                  s+=a;
                  a=1;
                  ch=c;
              }
          }
          s+=(str.charAt(str.length()-1));
          s+=a;
          return s;
	}
	
 }