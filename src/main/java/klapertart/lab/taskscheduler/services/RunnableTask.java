package klapertart.lab.taskscheduler.services;

import java.util.Date;

/**
 * @author TRITRONIK-PC_10040
 * @since 20/03/2023y
 *
 */

public class RunnableTask implements Runnable{
    private String message;

    public RunnableTask(String message){
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(new Date() + " Runnable task with " + message + " on thread " + Thread.currentThread().getName());
    }
}
