import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();// цикл с меню
            int command = scanner.nextInt();
            if (command == 1) { // шаги за опр день
                stepTracker.addNewNumbersStepsPerDay();
            } else if (command == 2) { // изменить цель по колву шагов
                stepTracker.changeStepGoal();
            } else if (command == 3) { // статистика за опр месяц
            stepTracker.printStatistic();
            } else if (command == 4) { // выход
                break;

            } else {
                System.out.println("Такой команды пока нет(");
            }
        }
    }

    static void printMenu() {
        System.out.println("1 - ввести количество шагов за определенный день");
        System.out.println("2 - изменить цель по количеству шагов в день");
        System.out.println("3 - напечатать статистику за определенный месяц");
        System.out.println("4 - выход");
    }
}