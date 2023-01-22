package civ;

import java.util.Scanner;

public class CivManager {

	Civilizations civ1 = new Korea();
	Civilizations civ2 = new Brazil();
	
	Civilizations myCiv = new MyCiv();
//	System.out.println(civ1.showCivInfo());
//	System.out.println(myCiv.showCivInfo());
	
	public void pickMyCiv() {
		System.out.println(civ1.showCivInfo());
		System.out.println(civ2.showCivInfo());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문명을 선택해주세요 : (일단은 1 입력)");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			myCiv.replaceValue(civ1.getCiv());
			System.out.println(myCiv.showCivInfo());
			break;
		case 2:
			myCiv.replaceValue(civ2.getCiv());
			System.out.println(myCiv.showCivInfo());
			break;
		}
	}
}
