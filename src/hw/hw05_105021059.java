package hw;
/*讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1)

 *  + …n*(n+1)並輸出結果。
 * Author: 105021059 王俊鑌
 */
import java.util.Scanner;
public class hw05_105021059 {
	public static void main(String[] args) {
		   Scanner scn =new Scanner(System.in);  
			 int n = scn.nextInt();
			int  sum=0; 
			for(int i = 1;i <= n;i++){
				sum+=(1+i)*i;
				
				}
			System.out.println(sum);
	}
}

