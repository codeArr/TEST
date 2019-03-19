package com.shirotest.demo;

import net.sf.json.JSONObject;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer1 {

	/*@JmsListener(destination = "${queue}")
    public void receive(String msg) {
        JSONObject jsonObject = JSONObject.fromObject(msg);
        User o = (User)JSONObject.toBean(jsonObject, User.class);

        System.out.println("监听器收到msg:" + o.toString());
	}*/
	@JmsListener(destination = "${topic}")
    public void receive(String msg) {
        JSONObject jsonObject = JSONObject.fromObject(msg);
        User o = (User)JSONObject.toBean(jsonObject, User.class);

        System.out.println("监听器 2 收到  :" + msg);
	}
   /* @JmsListener(destination = "$(topic)")
    public void receive(Object object){
	    User user = (User)object;
        System.out.println(" 监听器 2  "+user.toString());

    }*/



}