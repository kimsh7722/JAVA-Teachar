package Ch14;

class C07Super
{
	int num1;
	public void sound(){System.out.println("Super's Sound()");}		
}
class C07Sub extends C07Super
{
	int num2;//확장
	public void move(){System.out.println("Sub1 move()");}		//확장
	public void sound(){System.out.println("Sub's Sound()");}	//재정의
}
public class C07Upcasting {

	public static void main(String[] args) {
		//Upcasting
		C07Super ob = new C07Sub();	//확장된 num2에 접근가능?
									//확장된 move()를 사용할수 있는지?
									//재정의된 sound()를 사용할수 있는지?
		ob.num1=10;	//Super's 
		//ob.num2=20; //Sub's 
		//ob.move();
		ob.sound();
		
	}

}
