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
        Mobile1g mobileTwo = new Mobile1g(1_000);

        tryToPrintInfoAboutMobile1g(mobileOne);
        tryToPrintInfoAboutMobile1g(mobileTwo);

        tryToCompareTwoMobile1g(mobileOne, mobileTwo);
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

    static void tryToCompareTwoMobile1g(Mobile1g mobileOne, Mobile1g mobileTwo){
        boolean areEquals = mobileOne.equals(mobileTwo);

        System.out.println("Are mobileOne equals to mobileTwo: " + areEquals);
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
