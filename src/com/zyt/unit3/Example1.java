/**
 * 
 */
package com.zyt.unit3;

/**  
*
* @author : ZouYunTao
* @createTime : 2016年1月28日上午10:56:52  
* @version : 1.0 
* @description : 
*
* */

public class Example1 {

	/**
	 * @param args
	 *
	 * @author : ZouYunTao
	 * @createTime : 2016年1月28日 上午10:56:52
	 */

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        int sum=3;
        switch(sum){
        case 1:                                 /*当sum=1的时候，执行case 1，输出的结果是呼叫教学部*/
        	System.out.println("呼叫教学部");
        	break;
        case 2:                                 /*当sum=2的时候，执行case 2，输出的结果是呼叫人事部*/
        	System.out.println("呼叫人事部");
        	break;
        default:                                /*当sum>2的时候，执行default，输出的结果是人工服务*/
        	System.out.println("人工服务");
        }
	}

}
