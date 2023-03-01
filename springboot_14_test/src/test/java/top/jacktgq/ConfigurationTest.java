package top.jacktgq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import top.jacktgq.config.MsgConfig;

/**
 * @Author CandyWall
 * @Date 2022/1/23--23:01
 * @Description
 */
@SpringBootTest
@Import(MsgConfig.class)
public class ConfigurationTest {
    @Autowired
    private String msg;

    @Test
    public void testMsgConfig() {
        System.out.println("msg = " + msg);
    }
}
