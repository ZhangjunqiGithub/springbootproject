package top.jacktgq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.jacktgq.service.MessageService;
import top.jacktgq.service.OrderService;

/**
 * @Author CandyWall
 * @Date 2022/2/15--13:12
 * @Description
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private MessageService messageService;

    @Override
    public void order(String orderId) {
        // 一系列的操作，包含各种服务调用，处理各种业务
        System.out.println("订单开始处理");
        // 短信消息处理
        messageService.sendMessage(orderId);

        System.out.println("订单处理结束");
        System.out.println();
    }
}
