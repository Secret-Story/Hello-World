/**
 * 
 */
package com.zyt.unit3;

/**  
*
* @author : ZouYunTao
* @createTime : 2016��1��28������10:56:52  
* @version : 1.0 
* @description : 
*
* */

public class Example1 {

	/**
	 * @param args
	 *
	 * @author : ZouYunTao
	 * @createTime : 2016��1��28�� ����10:56:52
	 */

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        int sum=3;
        switch(sum){
        case 1:                                 /*��sum=1��ʱ��ִ��case 1������Ľ���Ǻ��н�ѧ��*/
        	System.out.println("���н�ѧ��");
        	break;
        case 2:                                 /*��sum=2��ʱ��ִ��case 2������Ľ���Ǻ������²�*/
        	System.out.println("�������²�");
        	break;
        default:                                /*��sum>2��ʱ��ִ��default������Ľ�����˹�����*/
        	System.out.println("�˹�����");
        }
	}

}
