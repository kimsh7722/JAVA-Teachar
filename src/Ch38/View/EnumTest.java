package Ch38.View;

enum Role {

	NONMEMBER,	//0 
	MEMBER, 	//1
	MANAGER		//2
}

public class EnumTest {

	
	public static void main(String[] args) {
			
		Role a = Role.MEMBER;
		
		System.out.println("a : " +  a.toString());
		int tmp = a.ordinal();
		System.out.println("tmp : " +  tmp);
		if(a.ordinal()>=Role.MANAGER.ordinal()) {
			
		}
		
	}
}
