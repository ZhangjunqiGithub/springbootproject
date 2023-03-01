package top.jacktgq.pojo;

import lombok.Data;

/**
 * @Author CandyWall
 * @Date 2022/2/13--21:14
 * @Description 存储手机号和验证码的实体类
 */
@Data
public class SMSCode {
    private String phone;
    private String code;
}
