package theory.inheritance;

import java.util.List;

/**
 * класс для создания экземпляров классов Mobile[N]g
 * <p>
 * нужен для демонстрации наследования
 */
public class MobileDevicesUsage {
    public static void main(String[] args) {
        Mobile1g mobileOne = new Mobile1g(1_000);
        Mobile1g mobileTwo = new Mobile1g(1234534);
        Mobile1g mobileThree = new Mobile1g(8765432);

        createMobileDevice(mobileOne, "white", "siemens s65", 2006);
        createMobileDevice(mobileTwo, "black", "siemens s65", 2006);
        createMobileDevice(mobileThree, "black", "siemens s65", 2006);

        tryToPrintInfoAboutMobile1g(mobileOne);
        tryToPrintInfoAboutMobile1g(mobileTwo);
        tryToPrintInfoAboutMobile1g(mobileThree);

        tryToCompareTwoMobile1g(mobileOne, mobileTwo);
        tryToCompareTwoMobile1g(mobileOne, mobileThree);
        tryToCompareTwoMobile1g(mobileTwo, mobileThree);
    }

    static void createMobileDevice (Mobile1g mobile1g, String color, String modelName, int year) {
        mobile1g.setColor(color);
        mobile1g.setModelName(modelName);
        mobile1g.setYearOfProduce(year);
    }

    // данный метод создан для того, чтобы попытаться распечатать строковое представление
    // экземпляра класса Mobile1g.
    // если не переопределить метод toString(), то строковое представление объекта будет
    // представлять собой ссылку на путь до файла + хешкод в шестнадцатиричной системе счисления:
    // (пример: theory.inheritance.Mobile1g@2a84aee7)
    //

    static void tryToPrintInfoAboutMobile1g(Mobile1g mobile1g){
        System.out.println(mobile1g.toString());
    }


    // по умолчанию, метод object1.equals(object2) сравнивает лишь ссылка этих двух обхектов,
    // возвращая true, лишь в том случае, когда ссылки одинаковы, то есть когда две эти переменные
    // ссылаются на одну и ту же ячейку памяти. (то есть это разные объекты, равносильно object1 == object2)
    // чтобы провести проверку по каким-то параметрам, которые для нас важны, то нас следует
    // переопределить данный метод equals самостоятельно
    static void tryToCompareTwoMobile1g(Mobile1g mobileOne, Mobile1g mobileTwo){
        boolean areEquals = mobileOne.equals(mobileTwo);

        System.out.println("Two mobile1g devices are equals: " + areEquals);
    }

    // использование базового класса Mobile1g
    static void useMobile1g() {
        Mobile1g mobile1g = new Mobile1g(100);

        mobile1g.call();

        System.out.println("mobile1g instanceof Mobile1g = " + (mobile1g instanceof Mobile1g));
        System.out.println("\n----------------------------------------------------------------\n");

    }

    // использование класса Mobile2g доказывает, что нет необходимости повторного создания метода call(),
    // можно использовать родительский метод
    static void useMobile2g() {
        Mobile2g mobile = new Mobile2g(200);

        mobile.call();

        mobile.sendSMS("hello there!");
        mobile.sendSMS("hello there! tooooooooo loooong messssage");

        System.out.println("mobile2g instanceof Mobile1g = " + (mobile instanceof Mobile1g));
        System.out.println("mobile2g instanceof Mobile2g = " + (mobile instanceof Mobile2g));
        System.out.println("\n----------------------------------------------------------------\n");
    }

    // ключевое отличе в том, что мы исправили метод sendSMS, переопредлив этот метод в классе Mobile3g
    static void useMobile3g() {
        Mobile3g mobile = new Mobile3g(333);

        mobile.call();

        mobile.sendSMS("hello there!");
        mobile.sendSMS("hello there! tooooooooo loooong messssage");

        mobile.internetAccess();

        System.out.println("mobile3g instanceof Mobile1g = " + (mobile instanceof Mobile1g));
        System.out.println("mobile3g instanceof Mobile2g = " + (mobile instanceof Mobile2g));
        System.out.println("mobile3g instanceof Mobile4g = " + (mobile instanceof Mobile3g));
        System.out.println("\n----------------------------------------------------------------\n");
    }
}
