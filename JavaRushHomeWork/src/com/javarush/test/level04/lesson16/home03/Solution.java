package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int counter=0;
        while (true){
            int a = Integer.parseInt(bufferedReader.readLine());
            counter=counter+a;
            if (a==-1){
                break;

            }

        }
        System.out.println(counter);


    }
}
