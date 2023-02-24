package org.lakers.proxy.cglib;

/**
 * Created on 2023/2/24 14:20
 *
 * @author lakers
 */
public class CglibMain {
    public static void main(String[] args) {
        AliSmsService proxy = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        proxy.send("ali sms");
    }
}
