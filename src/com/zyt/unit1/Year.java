/**
 * 
 */
package com.zyt.unit1;

/**  
*
* @author : ZouYunTao
* @createTime : 2016��1��27������12:21:54  
* @version : 1.0 
* @description : 
*
* */

public class Year {
	static int a=2040;
	/**
	 * @param args
	 *
	 * @author : ZouYunTao
	 * @createTime : 2016��1��27�� ����12:21:55
	 */

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        String s= a%4==0?"a������":(a%100!=0?"a������":"a��������");       /*��������ôд��Ӧ��������д�ļ�࣬��Ҫ̫����*/
        String ss= a%4==0 && a%100!=0 ? "a������":"a��������";              /*�����д��*/
        String t= a%400==0?"a������":"a��������";
        System.out.println(s);
        System.out.println(ss);
        System.out.println(t);
	}

}
