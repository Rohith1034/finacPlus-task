class Optimized2ndquestion {

    public static double calculateAverageOptimizedUnits(int[] units, int startValue, int endValue) {
        if (units == null || units.length == 0) {
            return 0;
        }
        if (startValue > endValue) {
            return 0;
        }
        if (startValue < 0 || endValue < 0) {
            return -1;
        }

        double totalUnits = 0;
        int numberOfValues = 0;

        for (int value = startValue; value <= endValue; value++) {
            int count = 0;
            int remaining = value;
            for (int unit : units) {
                count += remaining / unit;
                remaining %= unit;
            }
            totalUnits += count;
            numberOfValues++;
        }

        if (numberOfValues == 0) {
            return 0.0;
        }

        double averageUnits = totalUnits / numberOfValues;
        return averageUnits;
    }

    public static void main(String[] args) {
        int[] availableUnits = {50, 20, 10, 5, 2, 1};
        double avg1 = calculateAverageOptimizedUnits(availableUnits, 1, 99);
        System.out.println("Returned average for 1 to 99: " + avg1);
    }
}