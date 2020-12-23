package com.github.mabutamail.javatemplate.core.classtempl;

interface Speak {
    /**
     * все поля в интерфейсе public static final, т. е. являются константами.
     * обычно рекомендуется избегать таких интерфейсов, но иногда вы можете найти интерфейс,
     * который не имеет методов и используется только для хранения списка постоянных значений.
     */
    public int i = 1;

    public void speak();
}
