package top.jacktgq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class RedisTemplateTests {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testSet() {
        ValueOperations valueOperations = stringRedisTemplate.opsForValue();

        valueOperations.set("age", "41");
    }
    @Test
    public void testGet() {
        ValueOperations valueOperations = stringRedisTemplate.opsForValue();
        System.out.println("age = " + valueOperations.get("age"));
        System.out.println("username = " + valueOperations.get("username"));
    }

    @Test
    public void hSet() {
        HashOperations hashOperations = stringRedisTemplate.opsForHash();
        hashOperations.put("user", "name", "空条承太郎");
        hashOperations.put("user", "age", "17");
        hashOperations.put("user", "替身使者", "白金之星");
    }

    @Test
    public void hGet() {
        HashOperations<String, Object, Object> hashOperations = stringRedisTemplate.opsForHash();
        System.out.println(hashOperations.get("user", "name"));
    }
    
    @Test
    public void testSAdd() {
        SetOperations<String, String> setOperations = stringRedisTemplate.opsForSet();
        setOperations.add("tokens", "a123b456", "a1b2c3d4e5", "abc1234567");
    }

    @Test
    public void testSGet() {
        SetOperations<String, String> setOperations = stringRedisTemplate.opsForSet();
        if (setOperations.isMember("tokens", "a1b2c3d4e5")) {
            setOperations.remove("tokens", "a1b2c3d4e5");
        }
    }
}
