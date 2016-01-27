/**
 * 
 */
package com.zyt.unit1;

/**  
*
* @author : ZouYunTao
* @createTime : 2016年1月26日下午11:42:25  
* @version : 1.0 
* @description : 
*
* */

public class Question1 {

	/**
	 * @param args
	 *编写一个收银柜台收款程序
	 * @author : ZouYunTao
	 * @createTime : 2016年1月26日 下午11:42:25
	 */

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        double a=36.85;              /*假设的物品单价*/
        int b=24;                    /*假设的购买数量*/
        double c=a*b;                /*假设的应收金额*/
        if (c>500){                  /*若消费金额大于500，享受8折优惠；小于500则是原价*/
        System.out.println(c*0.8);
        }else{       
        System.out.println(c);
        }
        int d=900;                   /*假设的收款金额*/
        double e=d-c;                /*假设的找零*/
        System.out.println(e);       /*存在舍入误差*/
                                     
        
        
	}

}
