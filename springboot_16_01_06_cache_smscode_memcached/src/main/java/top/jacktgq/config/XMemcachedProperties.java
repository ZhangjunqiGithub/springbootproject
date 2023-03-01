package top.jacktgq.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author CandyWall
 * @Date 2022/2/14--2:43
 * @Description
 */
@Component
@ConfigurationProperties(prefix = "memcached")
@Data
public class XMemcachedProperties {
    private String addressList;
    private int poolSize;
    private long opTimeout;
}
