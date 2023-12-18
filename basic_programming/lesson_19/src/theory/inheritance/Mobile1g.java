package theory.inheritance;

// класс характеризует мобильные телефоны первого поколения, которые умели лишь звонить
public class Mobile1g {
    private long phoneNumber;

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
        return "Мобильный телефон первого поколения с номером телефона " + phoneNumber;
    }

    //
//    @Override
//    public boolean equals(Object o) {
//        //
//        if (this == o) return true;
//        if (!(o instanceof Mobile1g mobile1g)) return false;
//
//        return getPhoneNumber() == mobile1g.getPhoneNumber();
//    }
}
