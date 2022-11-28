package Package3.model.vo;

public class Dog extends Animal{
	
	public static final String PLACE = "애견카페";
	private int weight;
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name, String kinds, int weigh) {
		super(name,kinds);
		this.weight = weight;
		
	}
	public static String getPlace() {
		return PLACE;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void speak() {
	System.out.println(super.toString() + "몸무게는 "+weight+"kg 입니다."); 
		
	}
	
	
	
	
}
