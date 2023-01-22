package civ;

public class Brazil extends Civilizations{

	private CivilizationDTO brazil = new CivilizationDTO("브라질", 0, 200, 100, 100, 0);

	@Override
	public CivilizationDTO getCiv() {
		return brazil;
	}

	@Override
	public String showCivInfo() {
		return "[ 현재 이 문명의 스테이터스 ]" 
				+ "\n 나라명 : " + brazil.getName() 
				+ "\n 보유 자금 : " + brazil.getMoney() 
				+ "\n 버섯(삼림) : " + brazil.getMushroom() 
				+ "\n 광물(채광) : " + brazil.getOre() 
				+ "\n 옥수수(농사) : " + brazil.getCorn() 
				+ "\n 외교 점수 : " + brazil.getDiplomacyPoints();
	}
}
