/*����P56��3.21*/
public class Conver {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        byte mybyte = 127;
        short myshort = 130;
        int myint = 150;
        long mylong = 200;
        float myfloat = 452.12f;
        double mydouble = 45.46546;
        char mychar = 10;
        System.out.println("byte����short�����ݽ���������Ϊ��" +(mybyte+myshort));
        /*�����������*/
        System.out.println("byte����int�����ݽ���������Ϊ��" +(mybyte+myint));
        System.out.println("byte����long�����ݽ���������Ϊ��" +(mybyte-mylong));
        System.out.println("byte����float�����ݽ���������Ϊ��" +(mybyte*myfloat));
        System.out.println("byte����double�����ݽ���������Ϊ��" +(mybyte/mydouble));
        System.out.println("byte����char�����ݽ���������Ϊ��" +(mybyte+mychar));
        System.out.println("short����int�����ݽ���������Ϊ��" +(myshort+myint));
        System.out.println("short����long�����ݽ���������Ϊ��" +(myshort-mylong));
        System.out.println("short����float�����ݽ���������Ϊ��" +(myshort*myfloat));
        System.out.println("short����double�����ݽ���������Ϊ��" +(myshort/mydouble));
        System.out.println("short����char�����ݽ���������Ϊ��" +(myshort+mychar));
        System.out.println("int����long�����ݽ���������Ϊ��" +(myint+mylong));
        System.out.println("int����float�����ݽ���������Ϊ��" +(myint-myfloat));
        System.out.println("int����double�����ݽ���������Ϊ��" +(myint*mydouble));
        System.out.println("int����char�����ݽ���������Ϊ��" +(myint/mychar));
        System.out.println("long����float�����ݽ���������Ϊ��" +(mylong+myfloat));
        System.out.println("long����double�����ݽ���������Ϊ��" +(mylong-mydouble));
        System.out.println("long����char�����ݽ���������Ϊ��" +(mylong*mychar));
        System.out.println("float����double�����ݽ���������Ϊ��" +(myfloat+mydouble));
        System.out.println("float����char�����ݽ���������Ϊ��" +(myfloat-mychar));
        System.out.println("double����char�����ݽ���������Ϊ��" +(mydouble+mychar));        
	}

}
