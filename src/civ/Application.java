package civ;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Civilizations civ1 = new Korea();
		Civilizations myCiv = new MyCiv();
		System.out.println(civ1.showCivInfo());
		System.out.println(myCiv.showCivInfo());

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("문명을 선택해주세요 : (일단은 1 입력)");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			myCiv.replaceValue((CivilizationDTO) civ1.getCiv());
			System.out.println(myCiv.showCivInfo());
		}
		
		System.out.print("턴 수를 정해주세요 : ");
		num = sc.nextInt();
		TurnCounter turn = new TurnCounter(num);
		
		while(turn.isOver() == false) {
			
		}
	}

}
