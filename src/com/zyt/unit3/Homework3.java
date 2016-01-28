/**
 * 
 */
package com.zyt.unit3;

/**  
*
* @author : ZouYunTao
* @createTime : 2016年1月28日上午11:53:57  
* @version : 1.0 
* @description : 
*
* */

public class Homework3 {

	/**
	 * @param args
	 *
	 * @author : ZouYunTao
	 * @createTime : 2016年1月28日 上午11:53:57
	 */

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请输入年份（例如：2012）");
		int a=2012;
		System.out.println(a);
        if (2012%4==0){
        	String Y = a%100!=0 || a%400==0 ? "2012是闰年":"2012不是闰年";
        	System.out.println(Y);
        }else{
        	System.out.println(a + "不是闰年");
        }
	}

}
