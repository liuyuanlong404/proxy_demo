package org.lakers.proxy.jdk;

import org.lakers.proxy.SmsService;
import org.lakers.proxy.SmsServiceImpl;

/**
 * Created on 2023/2/24 14:08
 *
 * @author lakers
 */
public class JdkMain {

    public static void main(String[] args) {
        SmsService proxy = (SmsService) JdkProxyFactory.getProxy(SmsServiceImpl.class);
        proxy.send("java");
    }
}
