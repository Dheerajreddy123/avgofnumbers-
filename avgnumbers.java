import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
		
		int m1;
        int m2;
        int m3;
        String str;
        str=s.next(); 
        //System.out.println("enter m1");
        m1=s.nextInt();
         // System.out.println("enter m2");
          m2=s.nextInt();
         // System.out.println("enter m3");
          m3=s.nextInt();
         // System.out.println("enter s");
         
        char c=str.charAt(0);
        System.out.println(c);
        System.out.println((m1+m2+m3)/3);
        

		
	}

}
