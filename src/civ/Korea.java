package civ;

public class Korea extends Civilizations{

	private CivilizationDTO korea = new CivilizationDTO("한국", 0, 200, 200, 0, 0);
	
	@Override
	public Object getCiv() {
		return korea;
	}

	@Override
	public String showCivInfo() {
		return "[ 현재 이 문명의 스테이터스 ]" 
	+ "\n 나라명 : " + korea.getName() 
	+ "\n 보유 자금 : " + korea.getMoney() 
	+ "\n 버섯(삼림) : " + korea.getMushroom() 
	+ "\n 광물(채광) : " + korea.getOre() 
	+ "\n 옥수수(농사) : " + korea.getCorn() 
	+ "\n 외교 점수 : " + korea.getDiplomacyPoints();
	}
}
