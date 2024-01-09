import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    MonthData monthData = new MonthData();
    Coverter converter = new Coverter();
    int goalByStepsPerDay = 10000;
    StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    void changeStepGoal() {
        System.out.println("Сейчас ваша ежедневная цель: 10000 шагов");
        System.out.println("Введите новую ежедневную цель шагов");
        int customGoalByStepsPerDay = scanner.nextInt();
        if (customGoalByStepsPerDay > 0) {
            goalByStepsPerDay = customGoalByStepsPerDay;
        } else {
            System.out.println("Вы ввели неверное количество шагов!");
            return;
        }
    }
    void addNewNumbersStepsPerDay() {
        System.out.println("Введите номер месяца (от 1 до 12) ");
        int month = scanner.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("Вы ввели несуществующий номер месяца(");
            return;
        }
        System.out.println("Введите день (от 1 до 30)");
        int days = scanner.nextInt();
        if (days > 30 || days < 0) {
            System.out.println("Вы ввели несуществующий день(");
            return;
        }
        System.out.println("Введите колличество шагов");
        int step = scanner.nextInt();
        if (step < 0) {
            System.out.println("Вы ввели отрицательное число(Идти нужно всегда вперед!!)");
            return;
        }
        MonthData monthData = monthToData[month - 1];
        monthData.days[days - 1] = step;
    }
    void printStatistic() {
        System.out.println("Введите номер месяца, по которому Вы хотите увидеть статистику");
        int month = scanner.nextInt();
        int sumSteps = monthData.sumStepsFromMonth();
        System.out.println("Количество пройденных шагов по дням:");
        monthData.printDaysAndStepsFromMonth();
        System.out.println("Общее количество шагов пройденых за месяц:");
        System.out.println(sumSteps);
        System.out.println("Максимальное пройденное количество шагов за месяц:");
        monthData.maxSteps();
        System.out.println("Среднее количество шагов за месяц:");// эту штуку я полностью сама сделала тк в презентации ее не было
        monthData.averageNumberOfSteps();
        System.out.println("Пройденная дистанция(в км):");
        converter.convertToKm(sumSteps);
        System.out.println("Количество сожжённых килокалорий:");
        converter.convertStepsToKilokalories(sumSteps);
        System.out.println("Лючшая серия:");
        monthData.bestSeries(goalByStepsPerDay);
    }


}
