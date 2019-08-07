package prob05;

import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		while(true) {
			Scanner sc= new Scanner(System.in);
			int a= (int) (1+100*Math.random());  
			/*
			Random random = new Random();
			int correctNumber =random.nextInt(10); //0~9까지
			System.out.println(correctNumber);
			*/	
			System.out.print("수를 결정하였습니다. 맞추어보세요.\n1-100\n1>>");
			
			int min=0,max=100;
			int ini=2;
			
			while(true) {
				int compare = sc.nextInt();
				if(compare<a) {
					if(min<compare) {
						min=compare;
					}
						
					System.out.println(min+"-"+max);
										
					System.out.println("더 높게");
					System.out.print(ini+">>");
					
					
				}else if(compare>a) {
					if(max>compare) {
						max=compare;
					}
						
					System.out.println(min+"-"+max);
										
					System.out.println("더 낮게");
					System.out.print(ini+">>");
				}else if(compare==a){
					System.out.println("맞았습니다.");
					break;
				}
				ini++;
			}

			while(true) {
				System.out.print("다시하시겠습니까(y/n)>>");
				String answer = sc.next();

				if(answer.equals("y")) {
					break;
				}else if(answer.equals("n")){
					sc.close();
					System.exit(0);
				}else {
					System.out.println("잘못입력하셨습니다.");
				}
			}
		}
	}

}