public class Main {
    public static void main(String[] args) {
      // Задание 1

        byte dog = 3;
        int cat = 2;
        short mouse = 4;
        long elefant = 300L;
        float sugarWeight = 5.5f;
        double saltWeight = 3.5;
        boolean dogIsAdult = dog > 20;
        char bar = 36;

        // Задание 2

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес бойцов " + weightOfAllBoxers + "кг.");
        System.out.println("Разница между весами бойцов " + weightDifference + "кг.");

        // Задание 3

        int weightOfBanana = 80;
        int weightOfMilk = 105;
        int weightOfIceCream = 100;
        int weightOfEggs = 70;
        int banana = weightOfBanana * 5;
        int milk = weightOfMilk * 2;
        int iceCream = weightOfIceCream * 2;
        int eggs = weightOfEggs * 4;
        int shake = banana + milk + iceCream + eggs;
        System.out.println ("Вес коктеля в граммах " + shake + " грамм.");
        int grPerKg = 1000;
        float shakekg = shake/(float)grPerKg;
        System.out.println ("Вес коктеля в килограммах " + shakekg + " кг.");

        // Задание 4

        int weightLoss1 = 250;
        int weightLoss2 = 500;
        int daysLoss1 = 7000 / 250;
        int daysLoss2 = 7000 / 500;
        int averageLoss = (daysLoss1 + daysLoss2)/2;
        System.out.println ("Потребуется дней если терять по 250 грамм в день: " + daysLoss1 + " дней.");
        System.out.println ("Потребуется дней если терять по 500 грамм в день: " + daysLoss2 + " дней.");
        System.out.println ("Среднее количество: " + averageLoss + " день.");

        //Задание 5

        int salaryOfMasha = 67760;
        int salaryOfDenis = 83690;
        int salaryOfKristina = 76230;
        double newSalaryOfMasha = salaryOfMasha * 1.1;
        double newSalaryOfDenis = salaryOfDenis * 1.1;
        double newSalaryOfKristina = salaryOfKristina * 1.1;
        double annualIncomeOfMasha = (newSalaryOfMasha - salaryOfMasha) * 12;
        double annualIncomeOfDenis = (newSalaryOfDenis - salaryOfDenis) * 12;
        double annualIncomeOfKristina = (newSalaryOfKristina - salaryOfKristina) * 12;
        System.out.println("Маша теперь получает " + newSalaryOfMasha + " рублей. Годовой доход вырос на " + annualIncomeOfMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryOfDenis + " рублей. Годовой доход вырос на " + annualIncomeOfDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryOfKristina + " рублей. Годовой доход вырос на " + newSalaryOfKristina + " рублей.");

    }
}