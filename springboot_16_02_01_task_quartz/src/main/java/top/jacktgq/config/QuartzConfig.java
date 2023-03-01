package top.jacktgq.config;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.jacktgq.quartz.MyQuartz;

/**
 * @Author CandyWall
 * @Date 2022/2/15--0:04
 * @Description
 */
@Configuration
public class QuartzConfig {
    @Bean
    public JobDetail printJobDetail() {
        //绑定具体的工作
        return JobBuilder.newJob(MyQuartz.class).storeDurably().build();
    }

    @Bean
    public Trigger printJobTrigger() {
        ScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ?");
        // 绑定具体的工作明细
        return TriggerBuilder.newTrigger().forJob(printJobDetail()).withSchedule(scheduleBuilder).build();
    }
}
