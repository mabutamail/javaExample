package com.github.mabutamail.javatemplate.core.alishevcore;

public class ClassTempl extends People {
    //    Logger logger = new Logger("log");
    public static void main(String[] args) {
        People oleg = new People("Oleg", 7);
        System.out.println(oleg);
        System.out.println(oleg.speak("школота"));
        System.out.println("summa " + oleg.summa(oleg.getAge(), 100 ));
        People person1 = new People();
        person1.setName("Персона1");
        System.out.println(person1.getName());
    }
}

class People {
    private String name;
    private int age;

    public int summa(int a, int b) {
        return a + b;
    }

    public String speak(String s) {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет " + s);
        return "Ok";
    }

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}