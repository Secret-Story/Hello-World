/**
 * 
 */
package com.zyt.unit3;

/**  
*
* @author : ZouYunTao
* @createTime : 2016��1��28������11:53:57  
* @version : 1.0 
* @description : 
*
* */

public class Homework3 {

	/**
	 * @param args
	 *
	 * @author : ZouYunTao
	 * @createTime : 2016��1��28�� ����11:53:57
	 */

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("��������ݣ����磺2012��");
		int a=2012;
		System.out.println(a);
        if (2012%4==0){
        	String Y = a%100!=0 || a%400==0 ? "2012������":"2012��������";
        	System.out.println(Y);
        }else{
        	System.out.println(a + "��������");
        }
	}

}
