public class PlayerOne {

    // Random
    java.util.Random die = new java.util.Random();

    // Sumpoints variable
    public int sumPoints;

    // Default constructor
    public PlayerOne() {
        this.sumPoints = 0;
    }

    // Get the number of points the player currently has
    public int getSumPoints() {
        return sumPoints;
    }
    // Throws a die and automatically adds it to the sum if it is greater than 1
    public void throwDie() {
        int diceThrow = die.nextInt(5) + 1;
        if (diceThrow > 1) {
            sumPoints = sumPoints + diceThrow;
        }
        else {
            sumPoints = 0;
        }
    }
    // Checks if the player has won
    public boolean isDone()
    {
        return sumPoints > 100;
    }
}
