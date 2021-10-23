package com.hendisantika.service;

import com.hendisantika.dto.SmsRequest;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-twilio-sms-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/10/21
 * Time: 12.57
 */
public interface SmsSender {

    void sendSms(SmsRequest smsRequest);

    // or maybe void sendSms(String phoneNumber, String message);
}
