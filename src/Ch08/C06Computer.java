package Ch08;

public class C06Computer {
	String SerialNO;
	String CPUSpec;
	String RAMSpec ;
	String DISKSpec;
	void PowerON() {
		System.out.println(SerialNO+"의 전원을 켭니다");
	}
	void PowerOFF() {
		System.out.println(SerialNO+"의 전원을 끕니다");
	}
	void ShowInfo() {
		System.out.println("SN	: "+ SerialNO);
		System.out.println("CPUSpec	: "+ CPUSpec);
		System.out.println("RAMSpec	: "+ RAMSpec);
		System.out.println("DISKSpec: "+ DISKSpec);
		
	}
}
