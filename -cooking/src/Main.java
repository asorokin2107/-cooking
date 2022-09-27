public class Main {

    public static void main(String[] args) {
        /*int milk = 200;
        int flour = 5;
        int eggs = 3;
        int sugar = 5;
        int oil = 30;
        int apple = 8;*/
        /*int milk = 1000;
        int flour = 400;
        int eggs = 3;
        int sugar = 10;
        int oil = 30;
        int apple = 8;*/ //для приготовления Pancake
        /*int milk = 300;
        int flour = 5;
        int eggs = 5;
        int sugar = 5;
        int oil = 30;
        int apple = 8;*/ //для приготовления Omelette
        int milk = 200;
        int flour = 300;
        int eggs = 4;
        int sugar = 5;
        int oil = 30;
        int apple = 8; //для приготовления Apple Pie

        if (flour >= 400 && sugar >= 10 && milk >= 1000 && oil >= 30) {
            System.out.println("Вы можете приготовить Pancake.");

        } else if (milk >= 300 && eggs >= 5 && flour >= 5) {
            System.out.println("Вы можете приготовить Omelette.");

        } else if (apple >= 3 && milk >= 100 && flour >= 300 && eggs >= 4) {
            System.out.println("Вы можете приготовить Apple Pie.");
        }
    }
}
