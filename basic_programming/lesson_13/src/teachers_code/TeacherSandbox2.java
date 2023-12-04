package teachers_code;

public class TeacherSandbox2 {
    public static void main(String[] args) {
        String[] pizzaMargarita = {"стандартное тесто", "без мяса", "томатный", "моцарелла"};
        String[] hunterPizza = {"стандартное тесто", "охотничьи колбаски", "грибной соус", "пармезан"};
        String[] chicagoPizza = {"пицца с высокими бортами", "все виды мяса", "специальный соус", "много сыра!"};

        // пример перегрузки методов (разный набор аргументов):
        String str1 = "hello fasrglkmstghkbmer;gvmewf;aekdmqwa".substring(2, 5);
        String str2 = "hello fasrglkmstghkbmer;gvmewf;aekdmqwa".substring(5);

        pizzaMaker(chicagoPizza, 5);
        pizzaMaker(pizzaMargarita);
        pizzaMaker(hunterPizza);

        pizzaMaker();
    }

    public static void pizzaMaker() {
        System.out.println("Я приготовил случайную пиццу!");
    }

    public static void pizzaMaker(String[] ingredients) {
        // ingredients[0] - основа для теста
        // ingredients[1] - мясная начинка
        // ingredients[2] - соус
        // ingredients[3] - сыр

        if (ingredients.length != 4) {
            System.err.println("Я не знаю, как готовить такую пиццу!");
            return;
        }

        System.out.printf(
                "Ваша пицца будет на основе %s, с начинкой из %s, соусом %s и сыром %s. Приятного аппетита!\n",
                ingredients[0], ingredients[1], ingredients[2], ingredients[3]);
    }
    public static void pizzaMaker(String[] ingredients, int countOfPizzas) {
        if (ingredients.length != 4) {
            System.err.println("Я не знаю, как готовить такую пиццу!");
            return;
        }

        System.out.printf(
                "Я приготовил для вас %d пицц на основе %s, с начинкой из %s, соусом %s и сыром %s. Приятного аппетита!\n",
                countOfPizzas, ingredients[0], ingredients[1], ingredients[2], ingredients[3]);
    }
}


// pay(EUR)
// pay(DKR)
// pay(PZL)

// maps(pointA, pointB, locationUSA) -> distance count in miles
// maps(pointA, pointB, locatioEU) -> distance couint in km