/*书上P42例3.6*/
public class Gess {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char word1 = 'd',word2 = '@',word3 = 'F',word4 = 'A';
		int p1 = 23045,p2 = 45213,p3 = 34523,p4 = 17483;
		System.out.println("d在unicode表中的顺序位置是:" + (int)word1);
		System.out.println("@在unicode表中的顺序位置是:" + (int)word2);
		System.out.println("F在unicode表中的顺序位置是:" + (int)word3);
		System.out.println("A在unicode表中的顺序位置是:" + (int)word4);
		System.out.println("unicode表中的第23045位是:" + (char)p1);
		System.out.println("unicode表中的第45213位是:" + (char)p2);
		System.out.println("unicode表中的第34523位是:" + (char)p3);
		System.out.println("unicode表中的第17483位是:" + (char)p4);
	}

}
