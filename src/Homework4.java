/*����P60��ϰ3*/
public class Homework4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        byte a = 120;
        short b = 150;
        int c;
        long d = 2147483648l;
    System.out.println("��byte�ͱ���aת��Ϊint�͵Ľ��Ϊ��" + (c = (int)a));
/*�����������ͱ���ȫ��ת����int�Ͳ�������*/
    System.out.println("��short�ͱ���bת��Ϊint�͵Ľ��Ϊ��" + (c = (int)b));
    System.out.println("��long�ͱ���dת��Ϊint�͵Ľ��Ϊ��" + (c = (int)d));
	}

}
