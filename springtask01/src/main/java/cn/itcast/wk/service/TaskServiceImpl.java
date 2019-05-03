package cn.itcast.wk.service;

import java.util.Date;

public class TaskServiceImpl implements  TaskService {

    public void firstTask() {
        System.out.println(new Date()+":这是第一个定时任务");
    }

    public void secondTask() {
        System.out.println(new Date()+":这是第二个定时任务");
    }
}
