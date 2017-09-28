/**
 * All rights Reserved, Designed By mengzs
 * @Author mengzs
 * @Date 2017年9月27日 下午8:33:45
 */
package com.mzs.hello;

import com.mzs.myservice.MyWebService;
import com.mzs.myservice.MyWebServiceService;

/**
 * @Author mengzs 
 * @Date 2017年9月27日
 */
public class web_1 {

	public static void main(String[] args) {
		MyWebServiceService myWebServiceService = new MyWebServiceService();
		MyWebService myWebService = myWebServiceService.getMyWebServicePort();
		myWebService.sayHello("孟志昇");
	}
}
