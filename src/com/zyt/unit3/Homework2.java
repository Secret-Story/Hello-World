/**
 * 
 */
package com.zyt.unit3;

/**  
*
* @author : ZouYunTao
* @createTime : 2016��1��28������11:14:42  
* @version : 1.0 
* @description : 
*
* */

public class Homework2 {

	/**
	 * @param args
	 *
	 * @author : ZouYunTao
	 * @createTime : 2016��1��28�� ����11:14:42
	 */

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        System.out.println("��������������������a�� b�� c");
        System.out.println("20    5    10");
        int a=20,b=5,c=10,d=20,e=5,f=10;
        System.out.println("��������ǣ�");
        System.out.println("a=20, b=5, c=10 ");
        if (a>b){
        	b=a;
        	a=e;
        }else{
        	a=a;
        	b=b;
        }
        if (b>c){
        	c=b;
        	b=f;
        }else{        	
        	b=b;
        	c=c;
        }
        if (a>c){
        	c=a;
        	a=f;
        }else{
        	c=c;
        	a=a;
        }
        System.out.println("�������к󣬽��Ϊ��");
        System.out.println("a="+a + "b="+b + "c="+c);
        
        
	}

}
