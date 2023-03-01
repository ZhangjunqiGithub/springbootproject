package top.jacktgq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.jacktgq.pojo.SMSCode;
import top.jacktgq.service.SMSCodeService;

/**
 * @Author CandyWall
 * @Date 2022/2/13--21:17
 * @Description
 */
@RestController
@RequestMapping("/smscode")
public class SMSCodeController {
    @Autowired
    SMSCodeService smsCodeService;

    @GetMapping("{phone}")
    public String getCode(@PathVariable String phone) {
        return smsCodeService.sendCodeToSMS(phone);
    }

    @PostMapping
    public boolean checkCode(@RequestBody SMSCode smsCode) {
        return smsCodeService.checkCode(smsCode);
    }
}
