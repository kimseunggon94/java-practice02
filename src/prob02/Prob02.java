package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력하세요.");
		int intArray[] = new int[5];
		double sum=0, ave;
		for(int i=0;i<intArray.length;i++) {
			intArray[i]=sc.nextInt();
		}
		for(int j=0;j<intArray.length;j++) {
			sum +=	intArray[j];
		}
		ave=sum/intArray.length;
		
		System.out.println("평균은 "+ave+" 입니다.");

		sc.close();
	}
}
