public class Classwork {
    public static void main(String[] args) {
        // пример с книгой

//        System.out.println("Я прочел страницу 0");
//        System.out.println("Я прочел страницу 1");
//        System.out.println("Я прочел страницу 2");
//        //...
//        System.out.println("Я прочел страницу 100");
//        System.out.println("Я закончил читать книгу");

        int totalPages = 100; // всего страниц в книге
        int currentPage = 0; // страница, которую читаем
//        while (currentPage <= totalPages) {
//            System.out.printf("Я прочел страницу %d\n", currentPage);
//            if (currentPage == totalPages) {
//                System.out.println("Я закончил читать книгу");
//            }
//            currentPage++;
//        }


//        for(int i = 1 ; i <= 8; i++ ) {
//            switch (i) {
//                case 1 -> System.out.println("Гарри Поттер и Филосфский камень");
//                case 2 -> System.out.println("Гарри Поттер и Тайная комната");
//                case 3 -> System.out.println("Гарри Поттер и Узник Азкабана");
//                case 4 -> System.out.println("Гарри Поттер и Кубок Огня");
//                case 5 -> System.out.println("Гарри Поттер и Орден Феникса");
//                case 6 -> System.out.println("Гарри Поттер и Принц полукровка");
//                case 7 -> System.out.println("Гарри Поттер и Дары смерти часть 1");
//                case 8 -> System.out.println("Гарри Поттер и Дары смерти часть 2");
//            }
//        }


        int sum = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                    System.out.printf("%d x %d  ", i, j);
                    if (j == 1) {
                        break;
                    }
            }
            System.out.println();

        }
    }
}
