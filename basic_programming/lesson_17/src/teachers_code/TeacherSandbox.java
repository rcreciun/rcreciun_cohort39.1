package teachers_code;


import mail_service.teachers_code.MailService;

public class TeacherSandbox {
    public static void main(String[] args) {
        MailService ilyasMail = new MailService("ilyas@mail.com",
                "1233");

        MailService anotherMail = new MailService("some_login@mail.com", "134234");
        MailService newMailAccount = new MailService("some_login@mail.com", "134234");

        // ..

        System.out.println("ilyasMail.login = " + ilyasMail.getLogin());
        System.out.println("ilyasMail.password = " + ilyasMail.getPassword());

        System.out.println("anotherMail.getLogin() = " + anotherMail.getLogin());
        System.out.println("anotherMail.getPassword() = " + anotherMail.getPassword());

        System.out.println("newMailAccount.getLogin() = " + newMailAccount.getLogin());

        ilyasMail.setPassword("4567", "1233");

        // возвращает имя класса данной переменной (тип данных)
        System.out.println("ilyasMail.getClass() = " + ilyasMail.getClass().getSimpleName());
        System.out.println("anotherMail.getClass() = " + anotherMail.getClass().getSimpleName());
    }
}
