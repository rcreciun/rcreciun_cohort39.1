package theory.inheritance;


// extends - ключевое слово, используемое при наследовании. То есть класс Mobile2g "расширяет" Mobile1g
// расширять функционал.
public class Mobile2g extends Mobile1g{
    // super(phoneNumber) - вызов конструктора родительского класса.
    //мы обязаны так сделать, потому что мы унаследовали логику родительского класса,
    // построенную на использовании phoneNumber
    public Mobile2g(long phoneNumber) {
        super(phoneNumber);
        System.out.printf("Mobile2g Constructor message: <2g devices has been activated with number %d>\n", phoneNumber);

    }

    //дочерний класс, класс-наслденик (Mobile2g) унаследовал все публичные методы и переменны своего класса-родителя,
    // то есть, хоть этого кода и нет в этом классе, он все равно "есть" по умолчанию, то есть, можно представить, что
    // в данном классе есть вот этот кож ниже (все публичные и protected поля и методы, исключение лишь private):

    /*
    public Mobile1g(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        System.out.printf("Mobile1g Constructor message: <1g devices has been activated with number %d>\n", phoneNumber);
    }

    public void call() {
        System.out.printf("I call from 1g mobile phone with number %d\n" , phoneNumber);
    }
     */

    // данный метод появился в классе Mobile2g, в родительском классе Mobile1g его не было.
    // данный метод принимает в качестве аргумента String message - сообщение, которое будет отправлено
    // тк поле phoneNumber - приветное в родительском классе, единственный способ получить его тут -
    // воспользоваться геттером. Чтобы напрямую обратиться к любому методу родительского класса, можно использовать
    // ключевое слово super.
    // в данном примере используется метод родительского класса - super.getPhoneNumber()
    public void sendSMS (String message) {
        // логика данного метода такова:
        // тк технологии только зарождаются, пока проблематично отправлять собщения длинней 30 символов, поэтому,
        // если message.length() больше 30 символов, то будут отправлены только первые 30 символов.

        if (message.length() > 30) {
            System.out.printf("Message too long, <%s> has been sent from 2g device with number %d\n",
                    message.substring(0, 30), super.getPhoneNumber());
        } else {
            System.out.printf("Message <%s> has been sent from 2g device with number %d\n", message, super.getPhoneNumber());
        }
    }

    @Override
    public void call() {
        System.out.printf("I call from 2g mobile phone with number %d\n" , super.getPhoneNumber());
    }
}
