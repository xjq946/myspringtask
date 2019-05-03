package cn.itcast.wk.service;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TaskServiceImpl implements TaskService {

    //@Scheduled(initialDelay = 1000,fixedDelay = 1000)
    @Scheduled(cron="*/5 * * * * ?")
    public void firstTask() {
        System.out.println(new Date()+":这是第一个定时任务");
    }

    //@Scheduled(initialDelay = 2000,fixedDelay = 3000)
    @Scheduled(cron="* 31 19 * * ?")
    public void secondTask() {
        System.out.println(new Date()+":这是第二个定时任务");
    }
}
