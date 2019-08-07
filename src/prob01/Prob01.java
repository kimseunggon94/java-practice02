package prob01;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		System.out.print( "금액: " );
		int money = scanner.nextInt();

		int num[]=new int[10];
		for(int i=0;i<10;i++) {
			num[i]=0;
		}
		int md[] = {50000, 10000, 5000,1000,500,100,50,10,5,1};
		for(int j=0;j<10;j++) {
			num[j]=money/md[j];
			money = money-num[j]*md[j];
		}
		for(int k=0;k<10;k++) {
			System.out.println(md[k]+"원 : "+num[k]+"개");
		}
		scanner.close();
	}
}