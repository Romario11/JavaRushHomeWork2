package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int [] x= {a,b,c};
        int posNum = 0;

        if (x[0]!=x[1]&&x[0]!=x[2]){
            System.out.println(1);
        }else if (x[1]!=x[0]&&x[1]!=x[2])
        {
            System.out.println(2);
        }else {
            System.out.println(3);
        }




    }
}