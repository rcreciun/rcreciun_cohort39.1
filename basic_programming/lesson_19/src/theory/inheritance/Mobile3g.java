package theory.inheritance;

// в java запрещено множественное наследование,
// то есть нельзя расширить более чем один класс (именнно класс, не касается интерфейсов)
// потому что при наследовании дочерник класс автоматически берет реализацию кода из класса-родителя.
// представим ситуацию, что у нас есть 2 класса-родителя, с методами одинаково названными,
// но с разной реализацией. Будет ошибкой выбрать любой из этих двух методов.
// Таким образом решением данной проблемы стал запрет множественного наследования
// !! ЗАПРЕЩЕНО: Mobile3g extends Mobile1g, Mobile2g

// Пометка. У одного родительского класса может быть сколько угодно дочерних, то есть тут ограничения нет

// тк в данном варианте выбран путь расширения функционала класса Mobile2g,
// это означает, что мы полчим доступ к коду класса Mobile1g.
// То есть класс Mobile3g является классом-наследником класса Mobile1g,
// хоть и не расширяет его на прямую
public class Mobile3g extends Mobile2g {

    public Mobile3g(long phoneNumber) {
        super(phoneNumber);
        System.out.printf("Mobile3g Constructor message: <3g devices has been activated with number %d>\n", phoneNumber);
    }

    //доказательством того, что мы расширяем функционал класса Mobile1g является использование super.getPhoneNumber(),
    // которого нет в классе Mobile2g
    public void internetAccess() {
        System.out.printf("Device 3g has successfully connected to the internet, using number  %d\n",
                super.getPhoneNumber());
    }


    // @Override - аннотация, не обязательная в последних версиях java.
    // Данная аннотация четко указывает, что метод был переопределен.
    // То есть в нем появился новый функционал в отличии от родительского метода
    @Override
    public void sendSMS (String message) {
        // исправили "болячку" родительского класса, когда не могли отправлять сообщение длинна которых более 30 символов

        System.out.printf("Message <%s> has been sent from 3g device with number %d\n", message, super.getPhoneNumber());
    }
}
