package civ;

public class TurnCounter {

	private int turns;
	
	public TurnCounter(int num) {
		this.turns = num;
	}
	
	public boolean isOver() {
		boolean over = false;
		
		if(turns > 0) {
			System.out.println(turns + "턴 남았습니다.");
			turns--;
		} else {
			System.out.println("모든 턴이 마무리 되었습니다.");
			over = true;
		}
		
		return over;
	}
}
