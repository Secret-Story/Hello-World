/**
 * 
 */
package com.zyt.unit1;

/**  
*
* @author : ZouYunTao
* @createTime : 2016年1月26日下午11:21:32  
* @version : 1.0 
* @description : 
*
* */

public class Example2 {

	/**
	 * @param args
	 *
	 * @author : ZouYunTao
	 * @createTime : 2016年1月26日 下午11:21:32
	 */

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        int a=-100, b=200;
        int flag = a>b ? 14:-12;
        System.out.println(flag);
        int c=20;
        String C = c>0 ? "正数":(c<=0 ? "0":"负数");         /*不建议这么些,应将代码写的越简洁越好*/
        String CC = c>0 || c<=0 ?  "正数" : "负数";          /*建议的写法，看起来简洁*/
        System.out.println(C);
        System.out.println(CC);
	}

}
