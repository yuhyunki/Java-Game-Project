package civ;

import java.util.Scanner;

public class CivManager {

	public static Civilizations civ1 = new Korea();
	public static Civilizations civ2 = new Brazil();
	public static Civilizations civ3 = new USA();
	public static Civilizations civ4 = new India();
	public static Civilizations civ5 = new France();
	public static Civilizations myCiv = new MyCiv();
	
	public void pickMyCiv() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 한국");
		System.out.println("2. 브라질");
		System.out.println("3. 미국");
		System.out.println("4. 인도");
		System.out.println("5. 프랑스");
		System.out.print("플레이 할 문명을 선택해주세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			myCiv.replaceValue(civ1.getCiv());
			civ1 = civ5;
			System.out.println(myCiv.showCivInfo());
			break;
		case 2:
			myCiv.replaceValue(civ2.getCiv());
			civ2 = civ5;
			System.out.println(myCiv.showCivInfo());
			break;
		case 3:
			myCiv.replaceValue(civ3.getCiv());
			civ3 = civ5;
			System.out.println(myCiv.showCivInfo());
			break;
		case 4:
			myCiv.replaceValue(civ4.getCiv());
			civ4 = civ5;
			System.out.println(myCiv.showCivInfo());
			break;
		case 5:
			myCiv.replaceValue(civ5.getCiv());
			System.out.println(myCiv.showCivInfo());
			break;
		}
		System.out.println();
	}
}
