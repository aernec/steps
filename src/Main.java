import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        // Так как сканнер далее нигде не используется в методе main,
        // чтобы не загромождать код, можно сделать чуть элегантнее в одну строку
        // StepTracker stepTracker = new StepTracker(new Scanner(System.in));
        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                stepTracker.addNewNumbersStepsPerDay();
            } else if (command == 2) {
                stepTracker.changeStepGoal();
            } else if (command == 3) {
            stepTracker.printStatistic();
            } else if (command == 4) {
                break;
                // Хотелось бы увидеть какое-то сообщение в консоли о том,
                // что произошел выход из программы
                // И здесь все-таки лучше использовать ретерн, чтобы полностью завершать программу
                // хотя в данном случае после цикла ничего нет, так и произойдет
            } else {
                System.out.println("Такой команды пока нет(");
            }
            // Его еще можно  добавить здесь
        }
    }

    static void printMenu() {
        System.out.println("1 - ввести количество шагов за определенный день");
        System.out.println("2 - изменить цель по количеству шагов в день");
        System.out.println("3 - напечатать статистику за определенный месяц");
        System.out.println("4 - выход");
    }
}