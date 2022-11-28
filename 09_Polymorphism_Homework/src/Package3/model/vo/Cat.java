package Package3.model.vo;

public class Cat extends Animal{
	
	private String location;
	private String coloer;
	public Cat() {
		super();
	}
	public Cat(String name, String kinds,String lacation, String coloer) {
		super(name, kinds);
		this.location = location;
		this.coloer = coloer;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getColoer() {
		return coloer;
	}
	public void setColoer(String coloer) {
		this.coloer = coloer;
	}
	
	public void speak() {
		System.out.println(super.toString()+location+"에 서식하며," +"색상은 "+coloer+"입니다.");
		
	}

}
