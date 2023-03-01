package top.jacktgq.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author CandyWall
 * @Date 2022/1/19--22:58
 * @Description
 */
@Component
@Data
public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;
}
