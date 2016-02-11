/**
 * 
 */
package com.hongbao.hessianhello.test;

import com.caucho.hessian.server.HessianServlet;

/**
 * @author hzllb
 *
 * 2016年2月11日
 */
public class HelloHessianServlet extends HessianServlet implements HelloService{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6386897489092183062L;

	/* (non-Javadoc)
	 * @see com.hongbao.hessianhello.test.HelloService#sayHello(java.lang.String)
	 */
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name;
	}
	

}
