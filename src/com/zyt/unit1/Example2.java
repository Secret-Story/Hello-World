/**
 * 
 */
package com.zyt.unit1;

/**  
*
* @author : ZouYunTao
* @createTime : 2016��1��26������11:21:32  
* @version : 1.0 
* @description : 
*
* */

public class Example2 {

	/**
	 * @param args
	 *
	 * @author : ZouYunTao
	 * @createTime : 2016��1��26�� ����11:21:32
	 */

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        int a=-100, b=200;
        int flag = a>b ? 14:-12;
        System.out.println(flag);
        int c=20;
        String C = c>0 ? "����":(c<=0 ? "0":"����");         /*��������ôЩ,Ӧ������д��Խ���Խ��*/
        String CC = c>0 || c<=0 ?  "����" : "����";          /*�����д�������������*/
        System.out.println(C);
        System.out.println(CC);
	}

}
