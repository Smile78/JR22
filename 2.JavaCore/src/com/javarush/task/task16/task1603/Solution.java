package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread sp1 = new SpecialThread();
        SpecialThread sp2 = new SpecialThread();
        SpecialThread sp3 = new SpecialThread();
        SpecialThread sp4 = new SpecialThread();
        SpecialThread sp5 = new SpecialThread();

//        Thread tr1 = new Thread();
//        Thread tr2 = new Thread();
//        Thread tr3 = new Thread();
//        Thread tr4 = new Thread();
//        Thread tr5 = new Thread();

        list.add(new Thread(sp1) );
        list.add(new Thread(sp2) );
        list.add(new Thread(sp3) );
        list.add(new Thread(sp4) );
        list.add(new Thread(sp5) );

        list.get(0).run();

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
