package top.jacktgq.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author CandyWall
 * @Date 2022/1/24--1:55
 * @Description
 */
@Data
@Component
@ConfigurationProperties(prefix = "test-case.random-book")
public class BookCase {
    private Integer id;
    private Integer id2;
    private String type;
    private String name;
    private String uuid;
    private Long publishTime;
}
