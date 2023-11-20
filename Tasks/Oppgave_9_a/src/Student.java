/**
 * Class representing a student and the number of tasks the student has completed.
 *
 * @author Håvard Daleng
 */
public class Student
{
  private int numOfTasks;
  private final String name;

  /**
   * Constructor requires name of student as well as tasks completed.
   *
   * @param name is the student name.
   * @param numOfTasks is the number of tasks completed.
   */
  public Student(String name, int numOfTasks)
    {
      this.name = name;
      this.numOfTasks = numOfTasks;
    }

  /**
   * Getter for name.
   *
   * @return name of the student.
   */
  public String getName() { return name; }

  /**
   * Getter for the number of tasks completed.
   *
   * @return number of tasks completed by the student.
   */
  public int getNumOfTasks() { return numOfTasks; }

  /**
   * toString method for the student.
   *
   * @return string containing number of tasks and name.
   */
  @Override
    public String toString() {
        return "Student{" +
                "numOfTasks=" + numOfTasks +
                ", name='" + name + '\'' +
                '}';
    }

  /**
   * Increments the number of tasks completed by the student.
   *
   * @param number number of tasks to increment by.
   */
  public void incrementNumOfTasks(int number)
    {
      this.numOfTasks += number;
    }

}
