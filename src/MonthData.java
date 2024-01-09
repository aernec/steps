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
         }
         System.out.println(finalSeries);
         return finalSeries;
     }
     int averageNumberOfSteps() {
         int averageNumberOfSteps = 0;
         for (int i = 0; i < days.length; i++) {
             averageNumberOfSteps += days[i];
         }

         averageNumberOfSteps = averageNumberOfSteps % 30;
         System.out.println(averageNumberOfSteps);
         return averageNumberOfSteps;
     }


}
