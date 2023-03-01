package top.jacktgq.service.impl.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import top.jacktgq.service.MessageService;

/**
 * @Author CandyWall
 * @Date 2022/2/28--20:53
 * @Description
 */
@Service
public class MessageServiceKafkaImpl implements MessageService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Override
    public void sendMessage(String orderId) {
        System.out.println("待发送短信的订单已纳入处理队列（kafka），id：" + orderId);
        kafkaTemplate.send("candywall", orderId);
    }

    @Override
    public String doMessage() {
        return null;
    }
}
