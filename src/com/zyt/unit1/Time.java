/**
 * 
 */
package com.zyt.unit1;

/**  
*
* @author : ZouYunTao
* @createTime : 2016年1月27日上午12:42:59  
* @version : 1.0 
* @description : 
*
* */

public class Time {

	/**
	 * @param args
	 *
	 * @author : ZouYunTao
	 * @createTime : 2016年1月27日 上午12:42:59
	 */

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        long time1=System.currentTimeMillis();      /*Jdk提供的计算时间的一个方法，从1970年1月1日到现在经历的毫秒数*/
        System.out.println(time1);
        int sum=0;
        for (int i=1;i<=10000;i++){                               /*计算机从0加到10000*/
        	sum=sum+i;
        	System.out.println(sum);                              /*计算机每加一次就输出一次，一共要加10000次*/
        }
        long time2=System.currentTimeMillis();      /*Jdk提供的计算时间的一个方法，从1970年1月1日到现在经历的毫秒数*/
        System.out.println(time2);
        System.out.println(time2-time1);
        }
        
	}

