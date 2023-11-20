import java.util.List;
import java.util.ArrayList;

/**
 * Class representing an overview of students, keeping track of the number
 * of tasks they've completed.
 *
 * @author Håvard Daleng
 */

public class TaskOverview
{

  /**
   * Number of students in overview.
   */
  private int numOfStudents;
    private List<Student> students;


  /**
   * Constructor initialising the overview.
   */
  public TaskOverview()
    {
      this.students = new ArrayList<>();
      numOfStudents = 0;
    }

  /**
   * Getter for the total number of students.
   *
   * @return number of students.
   */
  public int getNumOfStudents() { return this.numOfStudents; }

  /**
   * Register a new student in the overview.
   *
   * @param student new student to be registered.
   */
  public void registerStudent(Student student)
  {
    students.add(student);
    numOfStudents++;
  }

  /**
   * Return the number of tasks completed by a specific student.
   *
   * @param student student in question.
   * @return number of tasks completed by student.
   */
  public int getTasksDone(Student student)
  {
      return student.getNumOfTasks();
  }

  /**
   * toString method for the number of students and a list of them.
   *
   * @return string with number of students and their names.
   */
  @Override
  public String toString() {
      return "TaskOverview: " +
        "numOfStudents = " + numOfStudents +
        ", students = " + students +
        '}';
  }

  /**
   * Increment the number of tasks a specific student has completed.
   * @param student student in question.
   * @param tasks number of tasks to increment by.
   */
  public void incrementNumOfTasks(Student student, int tasks)
  {
    student.incrementNumOfTasks(tasks);
  }
}
