public class Lasagna {
    // Task 1: Return expected oven time in minutes (40)
    public int expectedMinutesInOven() {
        return 40;
    }

    // Task 2: Calculate remaining oven time in minutes
    public int remainingMinutesInOven(int actualMinutes) {
        return expectedMinutesInOven() - actualMinutes;
    }

    // Task 3: Calculate preparation time in minutes (2 minutes per layer)
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    // Task 4: Calculate total working time in minutes
    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return preparationTimeInMinutes(layers) + minutesInOven;
    }
}