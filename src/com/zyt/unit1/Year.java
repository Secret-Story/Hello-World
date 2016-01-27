/**
 * 
 */
package com.zyt.unit1;

/**  
*
* @author : ZouYunTao
* @createTime : 2016年1月27日下午12:21:54  
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
	 * @createTime : 2016年1月27日 下午12:21:55
	 */

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        String s= a%4==0?"a是闰年":(a%100!=0?"a是闰年":"a不是闰年");       /*不建议这么写，应当将代码写的简洁，不要太复杂*/
        String ss= a%4==0 && a%100!=0 ? "a是闰年":"a不是闰年";              /*建议的写法*/
        String t= a%400==0?"a是闰年":"a不是闰年";
        System.out.println(s);
        System.out.println(ss);
        System.out.println(t);
	}

}
