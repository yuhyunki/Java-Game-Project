package civ;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		CivManager cm = new CivManager();
		cm.pickMyCiv();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("턴 수를 정해주세요 : ");
		int num = sc.nextInt();
		TurnCounter turn = new TurnCounter(num);
		
		while(turn.isOver() == false) {
			
		}
	}

}
