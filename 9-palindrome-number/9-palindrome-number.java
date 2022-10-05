import java.util.*;
public class Solution {
    public boolean isPalindrome(int x) {
        int y=0;
        int z=x;
        while(x>0) {
            int rem=x%10;
            x=x/10;
            y=y*10+rem;
        }
        if(z==y)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(obj.isPalindrome(x));
    }
}