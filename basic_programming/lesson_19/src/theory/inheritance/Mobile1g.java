package theory.inheritance;

// класс характеризует мобильные телефоны первого поколения, которые умели лишь звонить
public class Mobile1g {
    private long phoneNumber;

    // поле создано исключительно для демонстрации работы метода equals, характеризует имя модели
    private String modelName;

    // поле создано исключительно для демонстрации работы метода equals, характеризует цвет девайса
    private String color;

    // поле создано исключительно для демонстрации работы метода equals, характеризует год производства
    private int yearOfProduce;

    // при создании экземпляра класса Mobile1g, мы обязаны указать номер телефона,
    // при успешной активации мы будем видеть соответствующее сообщение
    public Mobile1g(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        System.out.printf("Mobile1g Constructor message: <1g devices has been activated with number %d>\n", phoneNumber);
    }

    // в этом классе есть лишь один метод - звонить
    public void call() {
        System.out.printf("I call from 1g mobile phone with number %d\n" , phoneNumber);
    }

    // данный геттер добавлен только после создания дочернего класса Mobile2g,
    // тк поле phoneNumber - приватное и не доступно даже наследникам класса, но при этом используется в
    // методе sendSMS
    public long getPhoneNumber() {
        return phoneNumber;
    }


    // метод toString - является методом класса Object, по умолчанию он лишь возвращает в тестовом виде информацию о
    // том, где расположен данный класс и хешкод (уникальный численный идентификатор) конкретного объекта,
    // но мы самостоятельно можем переопределить его так, как нам будет удобно:
    @Override
    public String toString() {
        return "Мобильный телефон первого поколения с номером телефона " + phoneNumber + ", цвет " + color;
    }

    // в переопределенном методе мы сами определяем по каким критериям сравнивать 2 объекта,
    // чтобы считать их равными друг другу. Это может быть какой-то один критерий, либо совокупность
    // в изначально варианте: return (this == obj); - сравниваются исключительно ссылки на объект в памяти
    @Override
    public boolean equals(Object obj) {
        // если два сравниваемых объекта ссылаются на одну и туже ячейку памяти,
        // то это абсолютно точно равные объекты, то есть по сути объект равен самому себе
        if (this == obj) {
            return true;
        }

        // первое что мы проверим - убедимся, что obj из аргументов является экземпляром класса Mobile1g
        // в случае, если obj не относится к этому классу, то мы попадем в блок if и вернем false
        if (!(obj instanceof Mobile1g) || obj == null) {
            return false;
        }

        // приведение типов данных, тк мы теперь абсолютно точно уверены, что obj - экземпляр класса Mobile1g,
        // создадим переменную при помощи явного привдения
        Mobile1g object = (Mobile1g) obj;

        // теперь реализуем логику сравнения обхектов по тем полям, которые для нас действительно важны,
        // игнорируя ненужные:

        // данная операция сравнивает this.modelName - поле сравниваемого объекта, того,
        // на котором вызван метод equals (mobileOne.equals(mobileTwo), mobileOne - this)
        // с объектом, с котормы сравниваем object.modelName - (mobileOne.equals(mobileTwo), mobileTwo - object)

        boolean isModelSame = this.modelName.equals(object.modelName);
        boolean isColorSame = this.color.equals(object.color);

        // тк yearOfProduce - примитив, то сравнивать будем при помощи "=="
        boolean isYearOfProduceSame = this.yearOfProduce == object.yearOfProduce;

        // мы не сравниваем номер телефона phoneNumber для нас не столь критичен,
        // поэтому мы игнорируем его при сравнении двух мобильных устройств

        return isModelSame && isColorSame && isYearOfProduceSame;
    }

    // сеттеры ниже нужны нам только для того, чтобы заполнить поля,
    // используемые в методе equals
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearOfProduce(int yearOfProduce) {
        this.yearOfProduce = yearOfProduce;
    }
}
