package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] mass = new int[10];

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            mass[i] = Integer.parseInt(buf.readLine());
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(mass[i] );
        }


    }
}

