package civ;

public class ResourceManager extends TurnManager {

	private int successRate;
	private int getAmount;
	
	{
		successRate = 90;
		getAmount = 200;
	}
	
	public void getResource() {
		System.out.println("====자원 선택====");
		System.out.println("1. 삼림");
		System.out.println("2. 채광");
		System.out.println("3. 농사");
		System.out.print("행동을 선택해주세요 : ");
		int no = sc.nextInt();
		
		switch(no) {
		case 1:
			System.out.println("삼림을 개발해 버섯을 얻습니다.");
			System.out.println("...");
			if((Math.random() * 100) < successRate) {
				System.out.println("성공하여 " + getAmount + "만큼의 버섯을 얻었습니다!");
				myCiv.earnSomething("버섯", getAmount);
			} else {
				System.out.println("개발에 실패하여 아무것도 얻지 못했습니다...");
			}
			break;
		case 2:
			System.out.println("광산을 채광해 광물을 얻습니다.");
			System.out.println("...");
			if((Math.random() * 100) < successRate) {
				System.out.println("성공하여 " + getAmount + "만큼의 광물을 얻었습니다!");
				myCiv.earnSomething("광물", getAmount);
			} else {
				System.out.println("개발에 실패하여 아무것도 얻지 못했습니다...");
			}
			break;
		case 3:
			System.out.println("농사를 지어 옥수수를 얻습니다.");
			System.out.println("...");
			if((Math.random() * 100) < successRate) {
				System.out.println("성공하여 " + getAmount + "만큼의 옥수수를 얻었습니다!");
				myCiv.earnSomething("옥수수", getAmount);
			} else {
				System.out.println("개발에 실패하여 아무것도 얻지 못했습니다...");
			}
			break;
		default:
			break;
		}
	}
}
