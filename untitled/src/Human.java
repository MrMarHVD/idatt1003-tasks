public class Human {
    // Fields
    private String eyeColour;
    private int age;
    private int height;

    // Default constructor
    public Human()
    {
        this.eyeColour = "Brown";
        this.age = 30;
        this.height = 170;
    }

    // Paramaterised constructor
    public Human(String eyeColour, int age, int height)
    {
        this.eyeColour = eyeColour;
        this.age = age;
        this.height = height;
    }

    // Get / set eye colour
    public String getEyeColour() {
        return eyeColour;
    }
    public void setEyeColour() {
        this.eyeColour = eyeColour;
    }

    // Get / set age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Get / set height
    public int getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }
}
