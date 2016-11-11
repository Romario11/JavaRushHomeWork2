package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

import java.util.UUID;

public class Solution
{
    public static void main(String[] args)
    {
        UUID id=UUID.randomUUID();
        Zerg z1 = new Zerg();
        Zerg z2 = new Zerg();
        Zerg z3 = new Zerg();
        Zerg z4 = new Zerg();
        Zerg z5 = new Zerg();
        Zerg z6 = new Zerg();
        Zerg z7 = new Zerg();
        Zerg z8 = new Zerg();
        Zerg z9 = new Zerg();
        Zerg z10 = new Zerg();
        z1.name=id.toString();
        id=UUID.randomUUID();
        z2.name=id.toString();
        id=UUID.randomUUID();
        z3.name=id.toString();
        id=UUID.randomUUID();
        z4.name=id.toString();
        id=UUID.randomUUID();
        z5.name=id.toString();
        id=UUID.randomUUID();
        z6.name=id.toString();
        id=UUID.randomUUID();
        z7.name=id.toString();
        id=UUID.randomUUID();
        z8.name=id.toString();
        id=UUID.randomUUID();
        z9.name=id.toString();
        id=UUID.randomUUID();
        z10.name=id.toString();


        Protos p1=new Protos();
        id=UUID.randomUUID();
        p1.name=id.toString();
        Protos p2=new Protos();
        id=UUID.randomUUID();
        p2.name=id.toString();
        Protos p3=new Protos();
        id=UUID.randomUUID();
        p3.name=id.toString();
        Protos p4=new Protos();
        id=UUID.randomUUID();
        p4.name=id.toString();
        Protos p5=new Protos();
        id=UUID.randomUUID();
        p5.name=id.toString();



        Terran t1 = new Terran();
        id=UUID.randomUUID();
        t1.name=id.toString();
        Terran t2 = new Terran();
        id=UUID.randomUUID();
        t2.name=id.toString();
        Terran t3 = new Terran();
        id=UUID.randomUUID();
        t3.name=id.toString();
        Terran t4 = new Terran();
        id=UUID.randomUUID();
        t4.name=id.toString();
        Terran t5 = new Terran();
        id=UUID.randomUUID();
        t5.name=id.toString();
        Terran t6 = new Terran();
        id=UUID.randomUUID();
        t6.name=id.toString();
        Terran t7 = new Terran();
        id=UUID.randomUUID();
        t7.name=id.toString();
        Terran t8 = new Terran();
        id=UUID.randomUUID();
        t8.name=id.toString();
        Terran t9 = new Terran();
        id=UUID.randomUUID();
        t9.name=id.toString();
        Terran t10 = new Terran();
        id=UUID.randomUUID();
        t10.name=id.toString();
        Terran t11 = new Terran();
        id=UUID.randomUUID();
        t11.name=id.toString();
        Terran t12 = new Terran();
        id=UUID.randomUUID();
        t12.name=id.toString();





    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}