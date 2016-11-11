package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man mm = new Man("ffdd",89,"ff");
        Man mm1 = new Man("fdsd",42,"kll");
        Woman ww = new Woman("cvcv",65,"dsd");
        Woman ww1 = new Woman("rere",43,"lpl");

        System.out.println(mm);
        System.out.println(mm1);
        System.out.println(ww);
        System.out.println(ww1);
    }
    static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString()
        {
            return "["+name + " " + age + " " + address+"]";
        }
    }
    static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString()
        {
            return "["+name + " " + age + " " + address+"]";
        }
    }



}
