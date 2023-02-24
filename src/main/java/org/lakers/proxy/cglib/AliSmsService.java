package org.lakers.proxy.cglib;

/**
 * Created on 2023/2/24 14:14
 *
 * @author lakers
 */
public class AliSmsService {

    public String send(String message) {
        System.out.println("aliyun send message:" + message);
        return message;
    }
}
