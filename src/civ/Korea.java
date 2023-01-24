package civ;

public class Korea extends Civilizations{

	private CivilizationDTO civ = new CivilizationDTO("한국", 0, 200, 200, 0, 0);

	@Override
	public CivilizationDTO getCiv() {
		return civ;
	}

	@Override
	public String showCivInfo() {
		return "[ 현재 이 문명의 스테이터스 ]" 
				+ "\n 나라명 : " + civ.getName() 
				+ "\n 보유 자금 : " + civ.getMoney() 
				+ "\n 버섯(삼림) : " + civ.getMushroom() 
				+ "\n 광물(채광) : " + civ.getOre() 
				+ "\n 옥수수(농사) : " + civ.getCorn() 
				+ "\n 외교 점수 : " + civ.getDiplomacyPoints();
	}

	@Override
	public int getMushroom() {
		return civ.getMushroom();
	}

	@Override
	public int getOre() {
		return civ.getOre();
	}

	@Override
	public int getCorn() {
		return civ.getCorn();
	}

	@Override
	public String getName() {
		return civ.getName();
	}

	@Override
	public int getDiplomacyPoints() {
		return civ.getDiplomacyPoints();
	}

	@Override
	public int getMoney() {
		return civ.getMoney();
	}

	@Override
	public void earnSomething(String type, int amount) {
		// TODO Auto-generated method stub
		switch(type) {
		case "버섯":
			civ.setMushroom(getMushroom() + amount);
			break;
		case "광물":
			civ.setOre(getOre() + amount);
			break;
		case "옥수수":
			civ.setCorn(getCorn() + amount);
			break;
		case "돈":
			civ.setMoney(getMoney() + amount);
			break;
		case "외교":
			civ.setDiplomacyPoints(getDiplomacyPoints() + amount);
			break;
		default:
			return;
		}
	}
}
