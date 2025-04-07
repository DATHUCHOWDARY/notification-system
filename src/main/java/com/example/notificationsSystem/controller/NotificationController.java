//package com.example.notificationsSystem.Controller;
//
//import com.example.notificationsSystem.Service.SMSNotificationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/notifications")
//public class NotificationController {
//    @Autowired
//    private SMSNotificationService smsNotificationService;
//
//    @PostMapping("/send-sms")
//    public String sendSMS(@RequestParam String toPhoneNumber,@RequestParam String messageBody){
//        smsNotificationService.sendSMS(toPhoneNumber,messageBody);
//        return "SMS sent succesfully!";
//    }
//}
