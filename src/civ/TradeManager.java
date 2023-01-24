package civ;

public class TradeManager extends TurnManager {

	private int randomBonus;
	private int randomTradePoints;
	private int tradePoints;

	{
		randomBonus = 20;
		randomTradePoints = 100;
		tradePoints = 50;
	}

	public Civilizations randomCivPicker() {

		int random = (int) (Math.random() * 4 + 1);

		switch(random) {
		case 1:
			return civ1;
		case 2:
			return civ2;
		case 3:
			return civ3;
		case 4:
			return civ4;
		case 5:
			return civ5;
		default:
			return null;
		}
	}

	public String randomResourcePicker() {
		int random = (int) (Math.random() * 3);

		switch(random) {
		case 0:
			return "버섯";
		case 1:
			return "광물";
		case 2:
			return "옥수수";
		default:
			return null;
		}
	}

	public void randomTradeMaster() {

		for(;;) {
			Civilizations randomCiv = randomCivPicker();
			String randomResource = randomResourcePicker();
			
			int randomResourceAmount = 0;
			int myResourceAmount = 0;
			switch(randomResource) {
			case "버섯":
				randomResourceAmount = randomCiv.getMushroom();
				myResourceAmount = myCiv.getMushroom();
				break;
			case "광물":
				randomResourceAmount = randomCiv.getOre();
				myResourceAmount = myCiv.getOre();
				break;
			case "옥수수":
				randomResourceAmount = randomCiv.getCorn();
				myResourceAmount = myCiv.getCorn();
				break;
			}
			
			int randomTradeAmount = (int) (Math.random() * randomResourceAmount);
			int money = (int) (randomTradeAmount / 10);
			
			if(randomResourceAmount > 0 && myResourceAmount > 0) {
				System.out.println(randomCiv.getName() + "이 거래를 요청했습니다.");
				System.out.println();
				System.out.println("====상대방이 원하는 것====");
				System.out.println(randomResource + " : " + randomTradeAmount);
				System.out.println();
				System.out.println("====현재 보유량====");
				System.out.println("내 " + randomResource + " : " + myResourceAmount);
				System.out.println();
				System.out.println("====보상====");
				System.out.println("보유 자금 : +" + money);
				System.out.println("외교 점수 : +" + randomTradePoints);
				System.out.println();
				System.out.println("거래를 진행하시겠습니까? (1 예 / 2 아니오) : ");
				int no = sc.nextInt();
				if(no == 1) {
					System.out.println("거래를 승낙했습니다.");
					myCiv.earnSomething("돈", money);
					myCiv.earnSomething(randomResource, -randomTradeAmount);
					myCiv.earnSomething("외교", randomTradePoints);
					randomCiv.earnSomething(randomResource, randomTradeAmount);
					randomCiv.earnSomething("돈", money);
					break;
				} else {
					System.out.println("거래를 거절했습니다.");
					break;
				}
			}
		}
	}

	public void tradeMaster() {
		System.out.println();
		System.out.println("====내 자원 현황====");
		System.out.println("1. 버섯 : " + myCiv.getMushroom());
		System.out.println("2. 광물 : " + myCiv.getOre());
		System.out.println("3. 옥수수 : " + myCiv.getCorn());
		
		System.out.print("팔고 싶은 자원을 선택해주세요 : ");
		int no = sc.nextInt();

		int myResourceAmount = 0;
		String myResourceName = "";
		switch(no) {
		case 1:
			myResourceAmount = myCiv.getMushroom();
			myResourceName = "버섯";
			break;
		case 2:
			myResourceAmount = myCiv.getOre();
			myResourceName = "광물";
			break;
		case 3:
			myResourceAmount = myCiv.getCorn();
			myResourceName = "옥수수";
			break;
		}
		
		System.out.println();
		System.out.println("====거래 가능 문명 목록====");
		System.out.println("1. " + civ1.getName());
		System.out.println("2. " + civ2.getName());
		System.out.println("3. " + civ3.getName());
		System.out.println("4. " + civ4.getName());
		
		System.out.print("거래할 상대를 선택해주세요 : ");
		int no2 = sc.nextInt();

		while(true) {
			System.out.print("거래량을 입력해주세요 : ");
			int amount = sc.nextInt();
			int money = (int) (amount / 10);
			
			if(amount > myResourceAmount) {
				System.out.println("입력한 거래량이 보유량보다 큽니다.");
				continue;
			} else {
				switch(no2) {
				case 1:
					System.out.println(civ1.getName() + "에게 팔았습니다.");
					System.out.println("자금을 " + money + "만큼 얻었습니다.");
					myCiv.earnSomething("돈", money);
					myCiv.earnSomething(myResourceName, -amount);
					myCiv.earnSomething("외교", tradePoints);
					civ1.earnSomething("돈", -money);
					break;
				case 2:
					System.out.println(civ2.getName() + "에게 팔았습니다.");
					System.out.println("자금을 " + money + "만큼 얻었습니다.");
					myCiv.earnSomething("돈", money);
					myCiv.earnSomething(myResourceName, -amount);
					myCiv.earnSomething("외교", tradePoints);
					civ2.earnSomething("돈", -money);
					break;
				case 3:
					System.out.println(civ3.getName() + "에게 팔았습니다.");
					System.out.println("자금을 " + money + "만큼 얻었습니다.");
					myCiv.earnSomething("돈", money);
					myCiv.earnSomething(myResourceName, -amount);
					myCiv.earnSomething("외교", tradePoints);
					civ3.earnSomething("돈", -money);
					break;
				case 4:
					System.out.println(civ4.getName() + "에게 팔았습니다.");
					System.out.println("자금을 " + money + "만큼 얻었습니다.");
					myCiv.earnSomething("돈", money);
					myCiv.earnSomething(myResourceName, -amount);
					myCiv.earnSomething("외교", tradePoints);
					civ4.earnSomething("돈", -money);
					break;
				default:
					break;
				}
				break;
			}
		}
	}
}
