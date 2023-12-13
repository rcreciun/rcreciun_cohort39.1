package mail_service.teachers_code;

import java.util.Random;

public class MailService {
    private String login;
    private String password;

    private String[] logins;

    public MailService(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        // сложная логика двойной аутентификации через
        // телефон/вторую почту и тп

        // вместо сложной проверки на данном этапе
        // используется рандомное значение boolean

        if (new Random().nextBoolean()) {
            return password;
        } else {
            return null;
        }
    }

    public void setPassword(String newPassword, String oldPassword) {
        if (oldPassword.equals(password)) {
            password = newPassword;
            System.out.println("Вы успешно поменяли свой пароль");
        } else {
            System.out.println("Некорректное значение старого пароля, значение пароля не было изменено");
        }
    }
}
