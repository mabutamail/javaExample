package com.github.mabutamail.javatemplate.core.classtempl;

//  абстрактные классы не имеют экземпляров, только у наследников
abstract class AbstractClass {
    private int i;  //  абстрактные классы могут иметь поля

    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }

    // абстрактный метод не имеет тела, реализуется в наследниках
    public abstract void abstractMethod();

    //  абстрактные классы могут иметь обычные методы
    public void method() {
        System.out.println("Метод абстрактного класса");
    }
}