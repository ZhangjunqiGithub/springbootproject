package top.jacktgq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import top.jacktgq.pojo.User;

@SpringBootTest
class StringRedisTemplateTests {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test

    public void testSaveUser() {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("user:1", new User("诸葛亮", 27));

        System.out.println(valueOperations.get("user:1"));
    }
}
