package org.lakers.proxy;

/**
 * Created on 2023/2/24 13:55
 *
 * @author lakers
 */
public class SmsServiceImpl implements SmsService{
    @Override
    public String send(String message) {
        System.out.println("send message " + message);
        return message;
    }
}
