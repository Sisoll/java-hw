package ch07;

/**
 * 
 * 6.類別Dog(狗)、Cat(貓)、Bird(鳥) 繼承Pet 
 * 建構子: 無參數建構子、3個參數建構子(nickname、age、color) 
 * 方法: * (覆寫Pet的方法) talk()、欄位的Setter/Getter
 * 
 * @author SisolShie
 *
 */
public class Dog extends Pet {

	private String nickname;
	private int age;
	private String color;

	
	public Dog() {	
	}
	
	public Dog(String nickname, int age, String color) {
		this.nickname = nickname;
		this.age = age;
		this.color = color;
	}
	
	@Override
	void talk() {
		System.out.println("汪汪");
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
