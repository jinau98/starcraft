package protoss;

//object(객체) 상태와 행동을 가진다.
public class Zealot {
	public Zealot() {
		this(100,100,16,1);
	}
	
	//매개변수의 타입이나 개수가 다르면 오버로딩
	public Zealot(int st, int sh, int attack, int armor){
		this.st=st;
		this.sh=sh;
		this.attack=attack;
		this.armor=armor;
		
		System.out.println("My Life Aior");
	}
	final String name="질럿";
	int st;		//체력
	int sh;		//실드
	int attack;
	int armor;
	
}
