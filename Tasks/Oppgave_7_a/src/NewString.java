
import java.lang.StringBuilder;
public final class NewString
{
    /* Class which allows us to shorten a string by
    removing all letters not the first letter of a given word,
    as well as remove a specified letter inputted by the user
     */
    // JavaDOC

    // Fields
    private String text;

    // Constructor
    public NewString(String input)
    {
        this.text = input;
    }

    // Get NewString as String
    public String getNewString()
    {
        return this.text;
    }

    // Shorten to the first letters of each word
    public NewString shorten()
    {
        String[] split = {};
        StringBuilder output = new StringBuilder();
        split = this.text.split(" ", -2);

        // For each element in split, append the first letter to the output variable
        for (String element : split)
        {
            output.append(element.charAt(0));
        }
        return new NewString(output.toString());
    }

    // Remove a given character from the string
    public NewString remove(char character)
    {
        StringBuilder output = new StringBuilder();
        int i = 0;

        while (i < this.text.length())
        {

            if (this.text.charAt(i) != character)
            {
                output.append(this.text.charAt(i));
            }

            i++;
        }

        return new NewString(output.toString());

    }

}
