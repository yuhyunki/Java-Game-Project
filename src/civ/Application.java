package civ;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("문명을 선택해주세요 : ");
		
		System.out.print("턴 수를 정해주세요 : ");
		int num = sc.nextInt();
		TurnCounter turn = new TurnCounter(num);
		
		while(turn.isOver() == false) {
			
		}
	}

}
