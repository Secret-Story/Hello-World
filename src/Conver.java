/*书上P56例3.21*/
public class Conver {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        byte mybyte = 127;
        short myshort = 130;
        int myint = 150;
        long mylong = 200;
        float myfloat = 452.12f;
        double mydouble = 45.46546;
        char mychar = 10;
        System.out.println("byte型与short型数据进行运算结果为：" +(mybyte+myshort));
        /*将运算结果输出*/
        System.out.println("byte型与int型数据进行运算结果为：" +(mybyte+myint));
        System.out.println("byte型与long型数据进行运算结果为：" +(mybyte-mylong));
        System.out.println("byte型与float型数据进行运算结果为：" +(mybyte*myfloat));
        System.out.println("byte型与double型数据进行运算结果为：" +(mybyte/mydouble));
        System.out.println("byte型与char型数据进行运算结果为：" +(mybyte+mychar));
        System.out.println("short型与int型数据进行运算结果为：" +(myshort+myint));
        System.out.println("short型与long型数据进行运算结果为：" +(myshort-mylong));
        System.out.println("short型与float型数据进行运算结果为：" +(myshort*myfloat));
        System.out.println("short型与double型数据进行运算结果为：" +(myshort/mydouble));
        System.out.println("short型与char型数据进行运算结果为：" +(myshort+mychar));
        System.out.println("int型与long型数据进行运算结果为：" +(myint+mylong));
        System.out.println("int型与float型数据进行运算结果为：" +(myint-myfloat));
        System.out.println("int型与double型数据进行运算结果为：" +(myint*mydouble));
        System.out.println("int型与char型数据进行运算结果为：" +(myint/mychar));
        System.out.println("long型与float型数据进行运算结果为：" +(mylong+myfloat));
        System.out.println("long型与double型数据进行运算结果为：" +(mylong-mydouble));
        System.out.println("long型与char型数据进行运算结果为：" +(mylong*mychar));
        System.out.println("float型与double型数据进行运算结果为：" +(myfloat+mydouble));
        System.out.println("float型与char型数据进行运算结果为：" +(myfloat-mychar));
        System.out.println("double型与char型数据进行运算结果为：" +(mydouble+mychar));        
	}

}
