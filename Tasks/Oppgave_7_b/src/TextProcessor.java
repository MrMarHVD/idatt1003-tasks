import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TextProcessor
{
    // Use DecimalFormat to truncate doubles
    DecimalFormat df = new DecimalFormat("#.##");

    private String input = "";

    // Constructor
    public TextProcessor(String input)
    {
        this.input = input;
    }

    // Get text as is
    public String getText()
    {
        return this.input;
    }

    // Get text with all letters capitalised
    public String getTextCapitalized()
    {
        return this.input.toUpperCase();
    }

    // Find number of words in text
    public int numOfWords()
    {
        String[] split = {};
        split = this.input.split(" ", -2);
        return split.length;
    }

    // Find average word length in text
    public double meanWordLength()
    {
        String[] split = {};
        int total = 0;
        split = this.input.split(" ", -2);

        // Sum the total number of characters in all the words combined and divide by the number of words
        for (String element : split)
        {
            total += element.length();
        }
        return Double.parseDouble(df.format(total / (double)split.length));
    }

    // Find average number of words per period
    public double numOfWordsPerPeriod()
    {
        int periodCount = 0;
        int i = 0;

        // Obtain the number of periods (dividing characters) in the input
        while (i < this.input.length())
        {
            if (this.input.charAt(i) == ',' || this.input.charAt(i) == '.' || this.input.charAt(i) == ':' || this.input.charAt(i) == ';')
            {
                periodCount++;
            }
            i++;
        }
        return Double.parseDouble(df.format(numOfWords() / (double)periodCount));
    }

    // Switch all instances of specific word for another word entered by the user
    public void replaceWord(String toBeReplaced, String toReplace)
    {
        this.input = this.input.replace(toBeReplaced, toReplace);
    }

}
