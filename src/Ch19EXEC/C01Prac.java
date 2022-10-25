package Ch19EXEC;

class caramel {
	public String toString() {
		return "캬라멜";
	}
}
class onion {
	public String toString() {
		return "어니언";
	}
}
class PopCorn <T>{
	//완성하기
	private T meterial;

	public T getMeterial() {
		return meterial;
	}
	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
	public void Fry() {
		System.out.println(meterial +" 맛 팝콘을 만듭니다.");
	}
	//+ getMeterial():T  : meterial 반환 하기
	//+ setMeterial(T meterial):void : meterial을 받아서 멤버에 저장
	//+ Fry():void : meterial 맛 팝콘을 만듭니다가 출력되게 하기 
	
}
public class C01Prac {

	public static void main(String[] args) {
		PopCorn<caramel> corn1 = new PopCorn<caramel>();
		corn1.setMeterial(new caramel());
		corn1.Fry();	//"caramel 맛 팝콘을 만듭니다"
		
		PopCorn<onion> corn2 = new PopCorn<onion>();
		corn2.setMeterial(new onion());
		corn2.Fry();	//"onion 맛  팝콘을 만듭니다"
	}	
}
