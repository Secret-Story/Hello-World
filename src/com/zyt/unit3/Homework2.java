/**
 * 
 */
package com.zyt.unit3;

/**  
*
* @author : ZouYunTao
* @createTime : 2016年1月28日上午11:14:42  
* @version : 1.0 
* @description : 
*
* */

public class Homework2 {

	/**
	 * @param args
	 *
	 * @author : ZouYunTao
	 * @createTime : 2016年1月28日 上午11:14:42
	 */

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        System.out.println("请依次输入三个整数：a， b， c");
        System.out.println("20    5    10");
        int a=20,b=5,c=10,d=20,e=5,f=10;
        System.out.println("您输入的是：");
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
        System.out.println("升序排列后，结果为：");
        System.out.println("a="+a + "b="+b + "c="+c);
        
        
	}

}
