//Java Solution
package Others;
import java.util.Scanner;

public class SwapingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int len=(int)(Math.log10(num))+1;
	    int ans=0;
	    if(len%2!=0){
	        ans= num%10;
	        num= num/10;
	    }
	    int temp = 0;
	    while(num!=0){
	        temp=temp*10+(num%10);
	        num= num/10;
	    }
	    int answer =0;
	    while(temp!=0){
	        answer =answer*100+(temp%100);
	        temp=temp/100;
	    }
	    if(len%2==0)
	        System.out.println(answer);
	    else
	        System.out.println(answer*10+ans);
	    sc.close();
	}

}
