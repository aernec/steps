public class Coverter {
    int convertToKm(int steps) {
        int stepsToKm = steps * 75 % 100000;
        System.out.println(stepsToKm);
        return stepsToKm;
    }
    int convertStepsToKilokalories(int steps) {
        int stepsToKilokalories = steps * 50 % 1000;
        System.out.println(stepsToKilokalories);
        return stepsToKilokalories;
    }
}
