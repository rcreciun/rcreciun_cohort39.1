public class IfElse {
    public static void main(String[] args) {
        int temperature = 6;

        // 35 +  - надевай шлепки, на улице жарко!
        // 25 +  - надевай кеды, на улице тепло
        // 15 +  - надевай кроссовки, на улице прохладно
        // Надевай теплые ботинки! На улице холодно!

        if (temperature > 35) {
            System.out.println("надевай шлепки, на улице жарко!");
        } else if (temperature > 25) {
            System.out.println("надевай кеды, на улице тепло");
        } else if (temperature > 15) {
            System.out.println("надевай кроссовки, на улице прохладно");
        } else {
            System.out.println("Надевай теплые ботинки! На улице холодно!");
        }

        System.out.println("Finish");


        String dayOfBirth = "10 may";
        String currentDate = "10 may";

        int qty = 16;
        int discount = 0;

        if (dayOfBirth.equalsIgnoreCase(currentDate) && qty > 10) {
            discount = 10;
        } else if (dayOfBirth.equalsIgnoreCase(currentDate) && qty > 5) {
            discount = 0;
        }

        System.out.println(discount);
    }
}
