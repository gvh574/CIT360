package com.company;

public class Main {

    public static void main(String[] args) {
	    personCounter test = new personCounter();
        Thread testThread = new Thread(test);
        testThread.start();
    }
}
