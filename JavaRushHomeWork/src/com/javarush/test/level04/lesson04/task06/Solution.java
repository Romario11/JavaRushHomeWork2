package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedReader.readLine());
        String dayOfWeek;

        switch (x){
            case 1 : dayOfWeek = "понедельник";
                break;
            case 2 : dayOfWeek = "вторник";
                break;
            case 3 : dayOfWeek = "среда";
                break;
            case 4 : dayOfWeek = "четверг";
                break;
            case 5 : dayOfWeek = "пятница";
                break;
            case 6 : dayOfWeek = "суббота";
                break;
            case 7 : dayOfWeek = "воскресенье";
                break;
            default: dayOfWeek = "такого дня недели не существует";
                break;
        }
        System.out.println(dayOfWeek);


    }

}