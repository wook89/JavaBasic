package chap06;

public class Telephone extends Phone{
	private String when;

	
	public Telephone() {
		
	}
	public Telephone(String owner) {
		super(owner);
	}
	public Telephone(String owner,String when) {
		super(owner);
		this.when = when;
		
	}
	void autoAnswering() {
		System.out.println(owner+"가 부재중이니 "+when+" 전화요망.");
	}
}
