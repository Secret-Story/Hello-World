/**
 * 
 */
package com.zyt.unit1;

/**  
*
* @author : ZouYunTao
* @createTime : 2016��1��27������12:42:59  
* @version : 1.0 
* @description : 
*
* */

public class Time {

	/**
	 * @param args
	 *
	 * @author : ZouYunTao
	 * @createTime : 2016��1��27�� ����12:42:59
	 */

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        long time1=System.currentTimeMillis();      /*Jdk�ṩ�ļ���ʱ���һ����������1970��1��1�յ����ھ����ĺ�����*/
        System.out.println(time1);
        int sum=0;
        for (int i=1;i<=10000;i++){                               /*�������0�ӵ�10000*/
        	sum=sum+i;
        	System.out.println(sum);                              /*�����ÿ��һ�ξ����һ�Σ�һ��Ҫ��10000��*/
        }
        long time2=System.currentTimeMillis();      /*Jdk�ṩ�ļ���ʱ���һ����������1970��1��1�յ����ھ����ĺ�����*/
        System.out.println(time2);
        System.out.println(time2-time1);
        }
        
	}

