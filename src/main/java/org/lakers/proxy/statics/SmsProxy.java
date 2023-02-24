package org.lakers.proxy.statics;

import org.lakers.proxy.SmsService;

/**
 * Created on 2023/2/24 13:56
 *
 * @author lakers
 */
public class SmsProxy implements SmsService {

    private final SmsService smsService;

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }


    @Override
    public String send(String message) {
        // 调用方法之前添加操作
        System.out.println("before method send()");
        String send = smsService.send(message);
        // 调用方法之后，添加自己的操作
        System.out.println("after method send()");
        return send;
    }
}
