public class Main {
    public static void main(String[] args) {
        // Залача 1
        byte byteNumber = 10;
        short shortNumber = 100;
        long longNumber = 1000L;
        int intNumber = 10000;
        float floatNumber = 10.125f;
        double doubleNumber = 100.125;
        char charSymbol = 'A';
        boolean flag = true;

        // Задача 2
        float weightBoxer1 = 78.2f;
        float weightBoxer2 = 82.7f;
        float totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Задача 2");
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        float diffWeight = weightBoxer2 - weightBoxer1;
        System.out.println("Разница между весами бойцов " + diffWeight + " кг");

        //Задача 3
        float weight_banana = 80f;
        float weight_milk = 105f;
        float weightIceCream = 100f;
        float weightEgg = 70f;
        float weightTotalGrams = weight_banana * 5 + weight_milk * 2 + weightIceCream * 2 + weightEgg * 4;
        float weightTotalKilogram = weightTotalGrams / 1000;
        System.out.println("Задача 3");
        System.out.println("Вес завтрака в килограммах " + weightTotalKilogram + " кг");

        //Задача 4
        int overWeight = 7000;
        int normWeight1 = 250;
        int normWeight2 = 500;
        int day1 = (overWeight + normWeight1 - 1) / normWeight1;
        int day2 = (overWeight + normWeight2 - 1) / normWeight2;
        int dayAvg = (day1 + day2 + 1) / 2;
        System.out.println("Задача 4");
        System.out.println("При уменьшении веса на 250 гр в  количество дней составит " + day1);
        System.out.println("При уменьшении веса на 500 гр количество дней составит " + day2);
        System.out.println("В среднем количество дней составит " + dayAvg);

        //Задача 5
        float salaryMasha = 67760f;
        float salaryDenis = 83690f;
        float salaryCristina = 76230f;
        float newSalaryMasha = salaryMasha + salaryMasha / 10;
        float newSalaryDenis = salaryDenis + salaryDenis / 10;
        float newSalaryCristina = salaryCristina + salaryCristina / 10;
        float diffSalaryGodMasha = (newSalaryMasha - salaryMasha) * 12;
        float diffSalaryGodDinis = (newSalaryDenis - salaryDenis) * 12;
        float diffSalaryGodCristina = (newSalaryCristina - salaryCristina) * 12;
        System.out.println("Задача 5");
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. " +
                "Годовой доход вырос на " + diffSalaryGodMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. " +
                "Годовой доход вырос на " + diffSalaryGodDinis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryCristina + " рублей. " +
                "Годовой доход вырос на " + diffSalaryGodCristina + " рублей");
    }
}