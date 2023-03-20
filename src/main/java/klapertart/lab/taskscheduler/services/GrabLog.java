package klapertart.lab.taskscheduler.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author TRITRONIK-PC_10040
 * @since 20/03/2023
 */

@Service
public class GrabLog {
    @Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;

    @PostConstruct
    public void grabStream0(){
        CronTrigger cronTrigger = new CronTrigger("0/5 * * * * *");
        threadPoolTaskScheduler.schedule(new RunnableTask("Grab Stream 0"), cronTrigger);
    }

    @PostConstruct
    public void grabStream1(){
        CronTrigger cronTrigger = new CronTrigger("0/11 * * * * *");
        threadPoolTaskScheduler.schedule(new RunnableTask("Grab Stream 1"), cronTrigger);
    }

    @PostConstruct
    public void grabStream2() {
        CronTrigger cronTrigger = new CronTrigger("0/15 * * * * *");
        threadPoolTaskScheduler.schedule(new RunnableTask("Grab Stream 2"), cronTrigger);
    }
}
