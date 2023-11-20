// A class for right triangles
public class Triangle {
    // Fields
    private double base;
    private double height;

    // Default constructor
    public Triangle() {
        this.base = 10.0;
        this.height = 10.0;
    }

    // Parameterized constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Get / set
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
         this.height = height;
    }

    // Calculate area
    public double getArea() {
        return base * height / 2;
    }
    // Calculate circumference
    public double getCircumference() {
        double sideC = Math.sqrt((base * base) + (height * height));
        return base + height + sideC;
    }

}
