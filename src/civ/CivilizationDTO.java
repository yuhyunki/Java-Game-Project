package civ;

public class CivilizationDTO {

	private String name;
	private int money;
	private int mushroom;
	private int ore;
	private int corn;
	private int diplomacyPoints;
	
	/**
	 * @param name
	 * @param money
	 * @param mushroom
	 * @param ore
	 * @param corn
	 * @param diplomacyPoints
	 */
	public CivilizationDTO(String name, int money, int mushroom, int ore, int corn,
			int diplomacyPoints) {
		super();
		this.name = name;
		this.money = money;
		this.mushroom = mushroom;
		this.ore = ore;
		this.corn = corn;
		this.diplomacyPoints = diplomacyPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}


	public int getMushroom() {
		return mushroom;
	}

	public void setMushroom(int mushroom) {
		this.mushroom = mushroom;
	}

	public int getOre() {
		return ore;
	}

	public void setOre(int ore) {
		this.ore = ore;
	}

	public int getCorn() {
		return corn;
	}

	public void setCorn(int corn) {
		this.corn = corn;
	}

	public int getDiplomacyPoints() {
		return diplomacyPoints;
	}

	public void setDiplomacyPoints(int diplomacyPoints) {
		this.diplomacyPoints = diplomacyPoints;
	}

	@Override
	public String toString() {
		return "CivilizationDTO [name=" + name + ", money=" + money + ", mushroom=" + mushroom + ", ore=" + ore
				+ ", corn=" + corn + ", diplomacyPoints=" + diplomacyPoints + "]";
	}
	
	
	
}
