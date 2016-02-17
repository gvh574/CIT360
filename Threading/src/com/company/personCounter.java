package com.company;

/**
 * Created by Greg on 2/16/16.
 */
public class personCounter implements Runnable {

    private int count = 0;

    @Override
    public void run() {
    countExecute count = new countExecute();
        count.increment(this.count);
        System.out.println(count);
    }
}
