public class MonthData {

    int[] days = new int[30];

     void printDaysAndStepsFromMonth() {
         for (int i = 0; i < days.length; i++) {
             System.out.println(i + 1 + " день: " + days[i]);
         }
     }

     int sumStepsFromMonth() {
         int sumSteps = 0;
         for (int i = 0; i < days.length; i++) {
             sumSteps += days[i];
         }
         System.out.println(sumSteps);
         // Метод нахождения сумму не должен заниматься выводом на экран
         // Классы и методы должны выполнять только одну задачу
         // Таким образом не выполняются принципы SOLID
         return sumSteps;
     }

     int maxSteps() {
         int maxSteps = 0;
         for (int i = 0; i < days.length; i++) {
             if (maxSteps < days[i]) {
                 maxSteps = days[i];
             }
         }
         System.out.println(maxSteps);
         // Аналогично про принципы SOLID
         return maxSteps;
     }

     int bestSeries(int goalByStepsPerDay) {
         int finalSeries = 0;
         for (int i = 0; i < days.length; i++) {
             if (days[i] >= goalByStepsPerDay) {
                 finalSeries++;
             } else {
                 finalSeries -= finalSeries;
             }
             // Лучшая серия находится неверно
         }
         System.out.println(finalSeries);
         // Аналогично про принципы SOLID
         return finalSeries;
     }

     int averageNumberOfSteps() {
         int averageNumberOfSteps = 0;
         for (int i = 0; i < days.length; i++) {
             // Не очень хорошо, что переменная называется среднее количество шагов, а хранит в себе сумму
             // Создавай новые переменные
             averageNumberOfSteps += days[i];
         }

         averageNumberOfSteps = averageNumberOfSteps % 30;
         // Аналогично про деление
         System.out.println(averageNumberOfSteps);
         // Аналогично про принципы SOLID
         return averageNumberOfSteps;
     }
}
