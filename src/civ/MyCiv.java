package civ;

public class MyCiv extends Civilizations{

	CivilizationDTO myCiv = new CivilizationDTO(null, 0, 0, 0, 0, 0);
	
	@Override
	public void replaceValue(CivilizationDTO civ) {
		myCiv.setName(civ.getName());
		myCiv.setMoney(civ.getMoney());
		myCiv.setMushroom(civ.getMushroom());
		myCiv.setOre(civ.getOre());
		myCiv.setCorn(civ.getCorn());
		myCiv.setDiplomacyPoints(civ.getDiplomacyPoints());
	}
	
	@Override
	public String showCivInfo() {
		return "\n[ 현재 내 문명의 스테이터스 ]" 
	+ "\n 나라명 : " + myCiv.getName() 
	+ "\n 보유 자금 : " + myCiv.getMoney() 
	+ "\n 버섯(삼림) : " + myCiv.getMushroom() 
	+ "\n 광물(채광) : " + myCiv.getOre() 
	+ "\n 옥수수(농사) : " + myCiv.getCorn() 
	+ "\n 외교 점수 : " + myCiv.getDiplomacyPoints();
	}

	@Override
	public CivilizationDTO getCiv() {
		// TODO Auto-generated method stub
		return myCiv;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return myCiv.getName();
	}

	@Override
	public int getMushroom() {
		// TODO Auto-generated method stub
		return myCiv.getMushroom();
	}

	@Override
	public int getOre() {
		// TODO Auto-generated method stub
		return myCiv.getOre();
	}

	@Override
	public int getCorn() {
		// TODO Auto-generated method stub
		return myCiv.getCorn();
	}

	@Override
	public int getMoney() {
		return myCiv.getMoney();
	}

	@Override
	public int getDiplomacyPoints() {
		return myCiv.getDiplomacyPoints();
	}

	@Override
	public void earnSomething(String type, int amount) {
		// TODO Auto-generated method stub
		switch(type) {
		case "버섯":
			myCiv.setMushroom(getMushroom() + amount);
			break;
		case "광물":
			myCiv.setOre(getOre() + amount);
			break;
		case "옥수수":
			myCiv.setCorn(getCorn() + amount);
			break;
		case "돈":
			myCiv.setMoney(getMoney() + amount);
			break;
		case "외교":
			myCiv.setDiplomacyPoints(getDiplomacyPoints() + amount);
			break;
		default:
			return;
		}
	}
}
