public class Converter {
    int step = 75;

    int convertToKm(int steps) {
        return (steps * step) / 100000;
    }

    int convertStepsToKilocalies(int steps) {
        return (steps * 50) / 1000;
    }
}