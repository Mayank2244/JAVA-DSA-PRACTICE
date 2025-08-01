import java.util.*;
// linked list reverseinteger problem

class reverseinteger{
    public static int reverse(int x) {

        int ans =0;
        while(x!=0){
            int rem=x%10;
            x=x/10;
            if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10) {
                return 0;
            }
            ans=ans*10+rem;

        }

        return ans;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int x =sc.nextInt();

        int ans = reverse(x);
        System.out.println(ans);
    }

}