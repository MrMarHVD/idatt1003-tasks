public class PlayerTwo {
    // SEE PlayerOne.java FOR DOCUMENTATION
    java.util.Random die = new java.util.Random();
    // Fields
    public int sumPoints;

    public PlayerTwo() {
        this.sumPoints = 0;
    }
    public int getSumPoints() {
        return sumPoints;
    }

    public void throwDie() {
        int diceThrow = die.nextInt(5) + 1;
        if (diceThrow > 1) {
            sumPoints = sumPoints + diceThrow;
        }
        else {
            sumPoints = 0;
        }
    }

    public boolean isDone()
    {
        return sumPoints > 100;
    }
}
