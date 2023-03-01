package top.jacktgq.controller;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author CandyWall
 * @Date 2022/1/19--13:00
 * @Description
 */
@Component
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
}
