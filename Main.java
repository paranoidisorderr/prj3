package Ivan.lesson3.main;

import Ivan.lesson3.cat.Cat;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("while");
        int count = 0;
        while (count < 10) {
            Cat cat = new Cat();
            System.out.println(cat);
            count++;
        }

        System.out.println("for");
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cat.setName(randomName(random));
            cat.setAge(randomAge(random));
            System.out.println("Name: " + cat.getName() + ", age: " + cat.getAge());
        }

        System.out.println("do-while");
        int j = 0;
        do {
            Cat cat = new Cat(randomName(random), randomAge(random));
            System.out.println(cat);
            j++;
        } while (j < 10);

        System.out.println("foreach");
        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(randomName(random), randomAge(random));
        }
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " - " + cat.getAge());
        }
    }

    static String randomName(Random random) {
        String name = "";
        for (int i = 0; i < 5; i++) {
            char c = (char) ('a' + random.nextInt(26));
            name += c;
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    static int randomAge(Random random) {
        return random.nextInt(28) + 1;
    }
}