package top.jacktgq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author CandyWall
 * @Date 2022/1/23--23:00
 * @Description
 */
@Configuration
public class MsgConfig {
    @Bean
    public String msg() {
        return "bean msg";
    }
}
