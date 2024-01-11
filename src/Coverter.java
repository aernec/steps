public class Coverter {

    int convertToKm(int steps) {
        int stepsToKm = steps * 75 % 100000;
        // Не совсем правильно реализована конвертация
        // % - оператор взятия остатка, а не деления
        // / - оператор деления

        System.out.println(stepsToKm);
        // Класс конвертер не занимается выводом на экран
        // Задача конвертера только конвертировать
        // Классы и методы должны выполнять только одну задачу
        // Таким образом не выполняются принципы SOLID

        // Если тебе нужно печатать значение, ты можешь это делать во внешнем методе, где вызывается конвертация
        // ведь текущий метод возвращает значение
        return stepsToKm;
    }

    int convertStepsToKilokalories(int steps) {
        int stepsToKilokalories = steps * 50 % 1000;
        System.out.println(stepsToKilokalories);
        // Здесь аналогичные замечания
        return stepsToKilokalories;
    }
}
