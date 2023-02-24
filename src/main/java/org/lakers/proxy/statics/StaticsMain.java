package org.lakers.proxy.statics;

import org.lakers.proxy.SmsService;
import org.lakers.proxy.SmsServiceImpl;

/**
 * Created on 2023/2/24 13:58
 *
 * @author lakers
 */
public class StaticsMain {
    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsService smsProxy = new SmsProxy(smsService);
        smsProxy.send("java");
    }
}
