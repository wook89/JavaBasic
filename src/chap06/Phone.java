package chap06;

public class Phone {

	protected String owner;
	
	void talk() {
		System.out.println(owner+"가 통화 중이다.");
	}
	public Phone(String owner) {
		this.owner = owner;
	}
	public Phone() {
		
	}
}
