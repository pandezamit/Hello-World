import java.io.*;
import java.util.*;


public class candies {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int ar[] = new int[t];
		for(int i=0;i<t;i++){
			ar[i]=sc.nextInt();
		}
		int lr[]= new int[t];
		int rl[]= new int[t];
		
		lr[0] = 1;
		for(int i=1;i<t;i++){
			if(ar[i]>ar[i-1]) lr[i]=lr[i-1]+1;
			else lr[i]=1;
		}
		
		int sum=lr[t-1];
		rl[t-1]=1;
		
		for(int i=t-2;i>=0;i--){
			if(ar[i]>ar[i+1]) rl[i]=rl[i+1]+1;
			else rl[i]=1;
		
			sum+=lr[i]>rl[i]? lr[i]:rl[i];
			
		}
		System.out.println(sum);
		
		}
		
//		for(int i=0;i<t;i++){
//			System.out.println(ar[i]);
//		}
		//System.out.println(n);
}
