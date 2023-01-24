package civ;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("╔═══════════════════════════════════════════════╗");
		System.out.println("║ 미니 문명에 오신 것을 환영합니다			║");
		System.out.println("║ 다섯 개의 문명 중 하나를 선택해			║");
		System.out.println("║ 다른 문명보다 더 큰 발전을 이룩해보세요			║");
		System.out.println("╠═══════════════════════════════════════════════╣");
		System.out.println("║ § 각 문명은 보유 자금 0, 외교 점수 0으로 시작합니다.	║");
		System.out.println("║ § 각 문명의 시작 자원은 조금씩 다릅니다.		║");
		System.out.println("║ § 최종 점수는 외교 점수 + 보유 자금으로 계산합니다		║");
		System.out.println("╚═══════════════════════════════════════════════╝");
		
		CivManager cm = new CivManager();
		cm.pickMyCiv();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("턴 수를 정해주세요 : ");
		int num = sc.nextInt();
		
		TurnCounter turn = new TurnCounter(num);
		System.out.println();
		
		TurnManager tm = new TurnManager();
		while(turn.isOver() == false) {
			System.out.println();
			tm.randomTradeEvent();
			tm.firstRound();
			System.out.println();
			tm.enemyGain();
		}
		System.out.println();
		tm.ending();
	}

}
