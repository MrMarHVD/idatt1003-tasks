

public class MinRandom {
    // Generates random integer between lowerBound and upperBound and outputs
    public static int nextInteger(int lowerBound, int upperBound) {
        java.util.Random chooseRandomInt = new java.util.Random();
        int randomInt = chooseRandomInt.nextInt(upperBound - lowerBound);
        randomInt = randomInt + lowerBound;
        return randomInt;
    }

    // Generates a random double from 0 to 1.0 and transforms to the user's desired range
    public static double nextDouble(double lowerBound, double upperBound) {
        java.util.Random chooseRandomDouble = new java.util.Random();
        double randomDouble = chooseRandomDouble.nextDouble();
        randomDouble = randomDouble * (upperBound - lowerBound) + lowerBound;
        return randomDouble;
    }
}
