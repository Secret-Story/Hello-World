/*书上P41例3.3*/
public class Number {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
         byte mybyte = 124;
         short myshort = 32564;
         int myint = 45784612;
         long mylong = 46789451;
         long result = mybyte + myshort + myint + mylong;
         System.out.println("结果为：" + result);
	     float myfloat = 32.789f;
	     double mydouble = 56.284;
	     double result1 = myfloat + mydouble;
         System.out.println("结果为:" + result1);
         double result2 = result + result1;
         System.out.println("结果为:" + result2);
	}

}
