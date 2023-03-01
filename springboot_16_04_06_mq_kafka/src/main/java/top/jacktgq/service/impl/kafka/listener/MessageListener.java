package top.jacktgq.service.impl.kafka.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Author CandyWall
 * @Date 2022/2/28--21:05
 * @Description
 */
@Component
public class MessageListener {
    @KafkaListener(topics = "candywall")
    public void onMessage(ConsumerRecord<String, String> record) {
        System.out.println("已完成短信发送业务(Kafka)，id：" + record.value());
    }
}
