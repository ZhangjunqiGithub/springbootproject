package top.jacktgq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.jacktgq.controller.utils.LogUtils;

/**
 * @Author CandyWall
 * @Date 2022/1/17--19:14
 * @Description
 */
@RestController
@RequestMapping("/books_lombok")
@Slf4j
public class BookController_lombok {
    @GetMapping
    public String getById() {
        System.out.println("springboot is running...");
        log.trace("log trace");
        log.debug("log debug ...");
        log.info("log info ...");
        log.warn("log warn ...");
        log.error("log error ...");
        return "springboot is running...";
    }
}
