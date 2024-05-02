package chap06;

public class Smartphone extends Telephone {
	private String game;
	
	public Smartphone(String owner,String game) {
		super(owner);
		this.game = game;
	}
	void playGame() {
		System.out.println(owner+"가 "+game+"중");
	}
}
