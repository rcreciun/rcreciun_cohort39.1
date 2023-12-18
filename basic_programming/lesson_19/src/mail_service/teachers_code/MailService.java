package mail_service.teachers_code;

import java.util.Arrays;
import java.util.Random;

public class MailService {
    private String login;
    private String password;

    private static String[] logins = new String[0];

    public static MailService createAccount(String login, String password) {
        boolean isLoginExist = false;

        for (int i = 0; i < logins.length; i++) {
            if (login.equals(logins[i])) {
                isLoginExist = true;
                break;
            }
        }

        if (isLoginExist) {
            System.out.println("Данный логин " + login + " уже существует в системе, " +
                    "пожалуйста попробуйте зарегестрироваться с новым значением");
            return null;
        } else {
            logins = Arrays.copyOf(logins, logins.length + 1);
            logins[logins.length - 1] = login;
            MailService mail = new MailService(login, password);
            System.out.println("Аккуант с логином " + login + " успешно создан");
            return mail;
        }
    }

    private MailService(String login, String password) {
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
