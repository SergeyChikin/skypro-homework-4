public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int injector = 1500;
        byte color = 127;
        short bookLibrary = 32000;
        long speedOfLight = 300000L;
        float sugarWeight = 3.5f;
        double pi = 3.1415926;
        System.out.println("Значение переменной injector с типом int равно  " + injector );
        System.out.println("Значение переменной color с типом byte равно  " + color );
        System.out.println("Значение переменной bookLibrary с типом short равно  " + bookLibrary );
        System.out.println("Значение переменной speedOfLight с типом long равно  " + speedOfLight );
        System.out.println("Значение переменной sugarWeight с типом float равно  " + sugarWeight );
        System.out.println("Значение переменной pi с типом double равно  " + pi );
    }
    public static void task2() {
        System.out.println("Задача 2");
        float a ;
        long b ;
        double c ;
        short d ;
        short e ;
        int f ;
        byte g ;
        a = 27.12f;
        b = 987678965549L;
        c = 2.786;
        d = 569;
        e = -159;
        f = 27897;
        g = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte lyudmilaPav = 23;
        byte annaSer = 27;
        byte ekaterinaAnd = 30;
        short paper = 480;
        int totalStudents  = lyudmilaPav + annaSer + ekaterinaAnd;
        int oneStudentPaper = paper / totalStudents;
        System.out.println("На каждого ученика расчитано " + oneStudentPaper + " листов бумаги.");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte machinePerformanceTwoMin = 16;
        int machinePerformanceOneMin = machinePerformanceTwoMin / 2;
        short twentyMin = 20;
        short day = 60 * 24;
        int threeDays = day * 3;
        int month = day * 30;
        int machinePerformance = twentyMin * machinePerformanceOneMin;
        System.out.println("За 20 минут машина произвела " + machinePerformance + " штук бутылок.");
        machinePerformance = day * machinePerformanceOneMin;
        System.out.println("За сутки машина произвела " + machinePerformance + " штук бутылок.");
        machinePerformance = threeDays * machinePerformanceOneMin;
        System.out.println("За 3 дня машина произвела " + machinePerformance + " штук бутылок.");
        machinePerformance = month * machinePerformanceOneMin;
        System.out.println("За 1 месяц машина произвела " + machinePerformance + " штук бутылок.");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte paintCans = 120;
        byte whitePaintCansClass = 2;
        byte brownPaintCansClass = 4;
        int paintCansClass = whitePaintCansClass + brownPaintCansClass;
        int totalClass = paintCans / paintCansClass;
        int whitePaintCans = totalClass * whitePaintCansClass;
        int brownPaintCans = totalClass * brownPaintCansClass;
        System.out.println("В школе, где " + totalClass + " классов,нужно " + whitePaintCans + " банок белой краски и " + brownPaintCans + " банок коричневой краски." );
    }
    public  static void task6() {
        System.out.println("Задача 6");
        byte weightBanana = 80;
        byte weightMilk = 105;
        byte weightIceCream = 100;
        byte weightEgg = 70;
        int weightBreakfast = ( weightBanana * 5 ) + ( weightMilk * 2) + ( weightIceCream * 2 ) + ( weightEgg * 4 );
        float weightBreakfastKilo = weightBreakfast / 1000f;
        System.out.println(weightBreakfast);
        System.out.println(weightBreakfastKilo);
    }
    public static void task7() {
        System.out.println("Задача 7");
        byte weightLoss = 7;
        float lossDayMin = 250 / 1000f;
        float lossDayMax = 500 / 1000f;
        float lossDayAverage = ( lossDayMin + lossDayMax ) / 2f;
        float timeLightDiet = weightLoss / lossDayMin;
        float timeHeavyDiet = weightLoss / lossDayMax;
        float timeAverageDiet = weightLoss / lossDayAverage;
        System.out.println(timeLightDiet);
        System.out.println(timeHeavyDiet);
        System.out.println(timeAverageDiet);
    }
    public static void task8() {
        System.out.println("Задача 8");
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;
        double salaryMashaRaising = salaryMasha * 0.1;
        double salaryDenisRaising = salaryDenis * 0.1;
        double salaryKristinaRaising = salaryKristina * 0.1;
        double annualSalaryDiffMasha = salaryMashaRaising * 12;
        double annualSalaryDiffDenis = salaryDenisRaising * 12;
        double annualSalaryDiffKristina = salaryKristinaRaising * 12;
        salaryMasha = salaryMasha + salaryMashaRaising;
        salaryDenis = salaryDenis + salaryDenisRaising;
        salaryKristina = salaryKristina + salaryKristinaRaising;
        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " + annualSalaryDiffMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + annualSalaryDiffDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristina + " рублей. Годовой доход вырос на " + annualSalaryDiffKristina + " рублей");




    }


}