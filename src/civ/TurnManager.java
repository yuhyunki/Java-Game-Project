package civ;

import java.util.Scanner;

public class TurnManager extends CivManager {

	private int randomTradeOffer;
	private int enemyGainAmount;

	Scanner sc = new Scanner(System.in);

	{
		randomTradeOffer = 10;
		enemyGainAmount = 50;
	}

	public void randomTradeEvent() {
		TradeManager tm = new TradeManager();

		if((int) (Math.random() * 100) < randomTradeOffer) {
			System.out.println("거래를 요청해온 문명이 존재합니다!!");
			tm.randomTradeMaster();
		}
	}

	public void firstRound() {
		TradeManager tm = new TradeManager();
		ResourceManager rm = new ResourceManager();

		for(int i = 1; i > 0; ) {
			System.out.println();
			System.out.println("====행동 선택====");
			System.out.println("1. 거래하기");
			System.out.println("2. 자원 개발");
			System.out.println("3. 내 상태 보기");
			System.out.print("행동을 선택해주세요 : ");
			int no = sc.nextInt();

			switch(no) {
			case 1:
				tm.tradeMaster();
				i--;
				break;
			case 2:
				rm.getResource();
				i--;
				break;
			case 3:
				System.out.println(myCiv.showCivInfo());
				break;
			default:
				System.out.println("입력하신 번호가 보기에 없습니다.");
				break;
			}
		}
	}
	
	public void enemyGain() {
		civ1.earnSomething("돈", enemyGainAmount);
		civ2.earnSomething("돈", enemyGainAmount);
		civ3.earnSomething("돈", enemyGainAmount);
		civ4.earnSomething("돈", enemyGainAmount);
	}
	
	public void ending() {
		int myPoint = myCiv.getMoney() + myCiv.getDiplomacyPoints();
		int civ1Point = civ1.getMoney() + civ1.getDiplomacyPoints();
		int civ2Point = civ2.getMoney() + civ2.getDiplomacyPoints();
		int civ3Point = civ3.getMoney() + civ3.getDiplomacyPoints();
		int civ4Point = civ4.getMoney() + civ4.getDiplomacyPoints();
		
		System.out.println("====최종 결산====");
		System.out.println(myCiv.getName() + " : " + myPoint);
		System.out.println(civ1.getName() + " : " + civ1Point);
		System.out.println(civ2.getName() + " : " + civ2Point);
		System.out.println(civ3.getName() + " : " + civ3Point);
		System.out.println(civ4.getName() + " : " + civ4Point);
		
		if(myPoint > civ1Point && myPoint > civ2Point && myPoint > civ3Point && myPoint > civ4Point) {
			System.out.println("이겼습니다!!!");
		} else {
			System.out.println("졌습니다...");
		}
	}
}

