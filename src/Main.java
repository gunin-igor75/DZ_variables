public class Main {
    public static void main(String[] args) {
        // ������ 1
        byte byteNumber = 10;
        short shortNumber = 100;
        long longNumber = 1000L;
        int intNumber = 10000;
        float floatNumber = 10.125f;
        double doubleNumber = 100.125;
        char charSymbol = 'A';
        boolean flag = true;

        // ������ 2
        float weightBoxer1 = 78.2f;
        float weightBoxer2 = 82.7f;
        float totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("������ 2");
        System.out.println("����� ��� ���� ������ " + totalWeight + " ��");
        float diffWeight = weightBoxer2 - weightBoxer1;
        System.out.println("������� ����� ������ ������ " + diffWeight + " ��");

        //������ 3
        float weight_banana = 80f;
        float weight_milk = 105f;
        float weightIceCream = 100f;
        float weightEgg = 70f;
        float weightTotalGrams = weight_banana * 5 + weight_milk * 2 + weightIceCream * 2 + weightEgg * 4;
        float weightTotalKilogram = weightTotalGrams / 1000;
        System.out.println("������ 3");
        System.out.println("��� �������� � ����������� " + weightTotalKilogram + " ��");

        //������ 4
        int overWeight = 7000;
        int normWeight1 = 250;
        int normWeight2 = 500;
        int day1 = (overWeight + normWeight1 - 1) / normWeight1;
        int day2 = (overWeight + normWeight2 - 1) / normWeight2;
        int dayAvg = (day1 + day2 + 1) / 2;
        System.out.println("������ 4");
        System.out.println("��� ���������� ���� �� 250 �� �  ���������� ���� �������� " + day1);
        System.out.println("��� ���������� ���� �� 500 �� ���������� ���� �������� " + day2);
        System.out.println("� ������� ���������� ���� �������� " + dayAvg);

        //������ 5
        float salaryMasha = 67760f;
        float salaryDenis = 83690f;
        float salaryCristina = 76230f;
        float newSalaryMasha = salaryMasha + salaryMasha / 10;
        float newSalaryDenis = salaryDenis + salaryDenis / 10;
        float newSalaryCristina = salaryCristina + salaryCristina / 10;
        float diffSalaryGodMasha = (newSalaryMasha - salaryMasha) * 12;
        float diffSalaryGodDinis = (newSalaryDenis - salaryDenis) * 12;
        float diffSalaryGodCristina = (newSalaryCristina - salaryCristina) * 12;
        System.out.println("������ 5");
        System.out.println("���� ������ �������� " + newSalaryMasha + " ������. " +
                "������� ����� ����� �� " + diffSalaryGodMasha + " ������");
        System.out.println("����� ������ �������� " + newSalaryDenis + " ������. " +
                "������� ����� ����� �� " + diffSalaryGodDinis + " ������");
        System.out.println("�������� ������ �������� " + newSalaryCristina + " ������. " +
                "������� ����� ����� �� " + diffSalaryGodCristina + " ������");
    }
}