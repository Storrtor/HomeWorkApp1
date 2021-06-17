public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Всем привет");
        System.out.println("------------------------");
        printThreeWords();
        System.out.println("------------------------");
        checkSumSign();
        System.out.println("------------------------");
        printColor();
        System.out.println("------------------------");
        compareNumbers();
        System.out.println("------------------------");
        System.out.println("Вроде всё работает) спустя 2.5 часа я это сделал)");


    }



    // (2)
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apples");





    } public static void checkSumSign() {
        // (3)
        //Ниже цифры отвечающие на ответ(сумма-положительна и сумма отрицательна)
        int a = 5;
        int b = 3;
        int sum = a+b;
        if (sum >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }





    } public static void printColor() {
        // (4)
        //Ниже число, которое нужно менять, чтобы отображались разные цвета в консоли
        int value = 0;
                if (value <= 0) {
                    System.out.println("Красный");
                } else if (value > 0 && value <= 100 ) {
                    System.out.println("Жёлтый");
        } else if (value > 100) {
                    System.out.println("Зелёный");
                }





        } public static void compareNumbers() {
        // (5)
    //Значения, которые нужно менять для изменения ответа
    int a = 1;
    int b = 2;
    if (a >= b) {
        System.out.println("a >= b");
    } else {
        System.out.println("a < b");
    }
    }
}
