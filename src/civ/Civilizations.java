package civ;

public abstract class Civilizations {

	public abstract String showCivInfo();
	
	public abstract void earnSomething(String type, int amount);
	
	public abstract String getName();

	public abstract int getMushroom();
	
	public abstract int getOre();
	
	public abstract int getCorn();
	
	public abstract int getDiplomacyPoints();
	
	public abstract int getMoney();

	public void replaceValue(CivilizationDTO civ) {
		// TODO Auto-generated method stub

	}

	public abstract CivilizationDTO getCiv();

}
