package com.shirotest.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Topic;

/**
 * 日期：2019-02-28 15:51 <br>
 * ActivityMq   HX   2019-02-28 15:51
 */

@Configuration
public class QueueConfig {
    @Value("${queue}")
    private String queue ;

    @Value("${topic}")
    private String topic ;


  /*  *//*
     * 点对点模式
     * @author hx
     * @date 2019/3/4
     * @return javax.jms.Queue
     *//*
    @Bean
    public javax.jms.Queue  logQueue() {
        return new ActiveMQQueue(queue);
    }
*/

    /*
     * 发布订阅模式
     * @author hx
     * @date 2019/3/4
     * @return javax.jms.Topic
     */
    @Bean
    public Topic topic(){
        return new ActiveMQTopic(topic);
    }
}
