/**
 * 
 */
package com.hongbao.hessianhello.test;

import com.caucho.hessian.client.HessianProxyFactory;

/**
 * @author hzllb
 *
 * 2016年2月11日
 */
public class HessianClient {
    public static void main(String[] args) throws Exception {
        String url = "http://localhost:8080/hessianhello/hello";
        HessianProxyFactory factory = new HessianProxyFactory();
        HelloService service = (HelloService) factory.create(HelloService.class, url);
        System.out.println(service.sayHello("Vee"));
        
    }
}
