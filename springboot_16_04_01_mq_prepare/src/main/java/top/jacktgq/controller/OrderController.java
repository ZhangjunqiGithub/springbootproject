package top.jacktgq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.jacktgq.service.OrderService;

/**
 * @Author CandyWall
 * @Date 2022/2/15--13:20
 * @Description
 */
@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("{orderId}")
    public void order(@PathVariable String orderId) {
        orderService.order(orderId);
    }
}
