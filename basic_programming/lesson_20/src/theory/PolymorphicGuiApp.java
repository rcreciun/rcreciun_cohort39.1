package theory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * <b>Окно Приложения:</b> Класс <i>PolymorphicGuiApp</i> расширяет <i>JFrame</i>, предоставляя основу для графического
 * интерфейса пользователя.
 * <p>
 * <b>Полиморфизм в Действии:</b> Метод <i>addComponentToPanel</i> принимает объект Component в качестве параметра.
 * Поскольку <i>JButton</i> и <i>JTextField</i> являются наследниками класса <i>Component</i>, они могут быть переданы
 * в этот метод. Это демонстрирует полиморфизм, так как один метод способен работать с различными компонентами
 * пользовательского интерфейса.
 * <p>
 * <b>Обработка Событий:</b> Для кнопки <i>button</i> устанавливается слушатель событий, который изменяет текст в текстовом
 * поле <i>textField</i> при её нажатии.
 *
 */
public class PolymorphicGuiApp extends JFrame {

    public PolymorphicGuiApp() {
        super("Демонстрация Полиморфизма");

        // Создаем панель для компонентов
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Создаем компоненты
        JButton button = new JButton("Кнопка");
        JTextField textField = new JTextField(10);

        // Добавляем компоненты в панель
        addComponentToPanel(panel, button);
        addComponentToPanel(panel, textField);

        // Добавляем обработчик событий для кнопки
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Кнопка нажата");
            }
        });

        // Добавляем панель во фрейм
        this.add(panel);
        this.setSize(400, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addComponentToPanel(JPanel panel, Component component) {
        panel.add(component);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PolymorphicGuiApp().setVisible(true);
            }
        });
    }
}
