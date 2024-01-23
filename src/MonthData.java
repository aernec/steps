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
         return sumSteps;
     }

     int maxSteps() {
         int maxSteps = 0;
         for (int i = 0; i < days.length; i++) {
             if (maxSteps < days[i]) {
                 maxSteps = days[i];
             }
         }
         return maxSteps;
     }

     int bestSeries(int goalByStepsPerDay) {
         int finalSeries = 0;
         int maxSeries = 0;
         for (int i = 0; i < days.length; i++) {
             if (days[i] >= goalByStepsPerDay) {
                 finalSeries++;
             } else {
                    if (maxSeries < finalSeries) {
                        maxSeries = finalSeries;
                    }
                    finalSeries = 0;
             }

         }
         if (finalSeries > maxSeries) {
             maxSeries = finalSeries;
         }
         return maxSeries;
     }

     int averageNumberOfSteps() {
         int averageNumberOfSteps;
         int sumSteps = sumStepsFromMonth();

         averageNumberOfSteps = sumSteps / 30;

         return averageNumberOfSteps;
     }
}
