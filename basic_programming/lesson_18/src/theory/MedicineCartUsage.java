package theory;


/**
 *  класс создан для использования сервиса MedicineCart
 *  <p>
 *  класс MedicineCart создан для демонстрации перегрузки конструкторов класса
 */
public class MedicineCartUsage {
    public static void main(String[] args) {

        // по умолчанию, если класс не содержит конструкторов,
        // то используется пустой конструктор:
        // (легально до создания конструктора MedicineCart(String name))
        // MedicineCart ilyasCart = new MedicineCart();


        // как только в классе создается хотя бы один конструктор,
        // то конструктор без аргументов (конструктор по умолчанию)
        // перестает работать и теперь единственное, чем можно воспользоваться - созданый конструктор:
        MedicineCart ilyasCart = new MedicineCart("Ilyas");
    }

}
