package civ;

public class MyCiv extends Civilizations{

	CivilizationDTO myCiv = new CivilizationDTO(null, 0, 0, 0, 0, 0);
	
	@Override
	public void replaceValue(CivilizationDTO civ) {
		myCiv.setName(civ.getName());
		myCiv.setMoney(civ.getMoney());
		myCiv.setMushroom(civ.getMoney());
		myCiv.setOre(civ.getOre());
		myCiv.setCorn(civ.getCorn());
		myCiv.setDiplomacyPoints(civ.getDiplomacyPoints());
		System.out.println("밸류 변경 완료~");
	}
	
	@Override
	public String showCivInfo() {
		return "[ 현재 내 문명의 스테이터스 ]" 
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
		return null;
	}
}
