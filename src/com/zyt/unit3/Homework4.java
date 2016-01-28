/**
 * 
 */
package com.zyt.unit3;

/**  
*
* @author : ZouYunTao
* @createTime : 2016年1月28日下午12:03:36  
* @version : 1.0 
* @description : 
*
* */

public class Homework4 {

	/**
	 * @param args
	 *
	 * @author : ZouYunTao
	 * @createTime : 2016年1月28日 下午12:03:36
	 */

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请输入你的工资的税前金额（￥）：");
		int salary =10000;		
		System.out.println(salary);
		if (salary-3500<=1500){
		   int tax=(salary-3500)*3%-0;
		}else if (salary-3500>1500 && salary-3500<=4500){
		   int tax=(salary-3500)*10%-105;
		}else if (salary-3500>4500 && salary-3500<=9000){
		   int tax=(salary-3500)*20%-105;
		}else if (salary-3500>9500 && salary-3500<=35000){
		   int tax=(salary-3500)*25%-105;
		}else if (salary-3500>35000 && salary-3500<=55000){
		   int tax=(salary-3500)*30%-105;
		}else if (salary-3500>55000 && salary-3500<=80000){
		   int tax=(salary-3500)*35%-105;
		}else if (salary-3500>80000){
		   int tax=(salary-3500)*40%-105;
		}
	}

}
