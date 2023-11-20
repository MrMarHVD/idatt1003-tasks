import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TextAnalysis2 {
    /*
    This is an expanded version of the TextAnalysis class, with the added functionality of
    counting words, finding average word length, finding average number of words per period,
    switching words for new ones, and switching all non-capital letters for capital letters
    */
    // JavaDOC


    // List for storing counts of characters
    List<Integer> numOfSigns = new ArrayList<>(Collections.nCopies(30, 0));

    // Constructor
    public TextAnalysis2(String input)
    {
        int length = input.length();
        char[] specialChar = {'Æ', 'Ø', 'Å'};

        // For each character in the input, process according to the code below
        for (int i = 0; i < length; i++)
        {
            // Convert character from lower to upper case since we don't
            char convertedChar = Character.toUpperCase(input.charAt(i));

            // charIdentified active keeps track of whether the character has been identified yet
            boolean charIdentified = false;

            // Check if a given character is one of the special characters 'Æ', 'Ø', or 'Å' and add 1 if so
            for (int j = 0; j <= 2; j++)
            {
                if (convertedChar == specialChar[j])
                {
                    int currentValue = numOfSigns.get(j + 26);
                    numOfSigns.set(j + 26, currentValue + 1);
                    charIdentified = true;
                }
            }

            // Check if character at position i is equal to any character A to Z
            int k = 0;
            for (char character = 'A'; character <= 'Z'; character++)
            {

                // If character at position i is equal to character being checked for, add 1 to corresponding int in numOfSigns
                if (convertedChar == character)
                {
                    int currentValue = numOfSigns.get(k);
                    numOfSigns.set(k, currentValue + 1);
                    charIdentified = true;
                }
                k++;
            }
            // If character has not been identified (is not a letter), add 1 to the last item in numOfSigns
            if (!charIdentified)
            {
                int currentValue = numOfSigns.get(29);
                numOfSigns.set(29, currentValue + 1);
            }


        }
    }


    

    // Get character count
    public int getCountOf(char character)
    {
        char[] specialChar = {'Æ', 'Ø', 'Å'};
        character = Character.toUpperCase(character);
        int output = 0;

        // Check if the input was a special character
        for (int j = 0; j < 2; j++)
        {
            if (character == specialChar[j])
            {
                output = numOfSigns.get(j + 26);

            }
        }

        // Check if the input was a normal character
        int k = 0;
        for (char comparison = 'A'; comparison <= 'Z'; comparison++)
        {
            if (character == comparison)
            {
                output = numOfSigns.get(k);

            }
            k++;
        }
        return output;
    }

    // Count the total number of different letters present in input
    public int getCountDiff()
    {
        int counter = 0;
        for (int i = 0; i <= 29; i++)
        {
            if (numOfSigns.get(i) != 0)
            {
                counter++;
            }
        }
        // Remove 1 if there are non-letters, as those aren't included
        if (numOfSigns.get(29) != 0)
        {
            counter--;
        }
        return counter;
    }

    // Get total number of characters
    public int getTotal()
    {
        int total = 0;
        for (int i = 0; i < 30; i++)
        {
            total = total + numOfSigns.get(i);
        }
        return total;
    }

    // Get percentage of input not a letter
    public float percentageNotLetter()
    {
        return (float)numOfSigns.get(29) / getTotal();
    }

    // Finds the most common character
    public String getMostCommon()
    {
        // If not proven otherwise, assume the most common character is the sum of non-letters
        String mostCommon = "Non-letter";
        char[] specialChar = {'Æ', 'Ø', 'Å'};
        char[] normalChar = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        // List of the indices of the most common characters
        List<Integer> mostCommonIndex = new ArrayList<>();
        List<Character> mostCommonChar = new ArrayList<>();



        // For every number in numOfSigns, do the following
        for (int i = 0; i <= 29; i++)
        {
            int charCount = numOfSigns.get(i);
            boolean isGreater = true;

            // If number is less than any other number, ignore and go to next number
            for (int number : numOfSigns)
            {
                if (charCount < number)
                {
                    isGreater = false;
                    break;
                }

            }

            // If not less than any other count, check if equal to any other count and add indices of both to mostCommonIndex if so
            if (isGreater)
            {
                mostCommonIndex.add(i);

                for (int j = 0; j <= 29; j++)
                {
                    if (charCount == numOfSigns.get(j))
                    {
                        mostCommonIndex.add(j);
                    }
                }
            }
        }


        // Obtain characters based on indices listed in mostCommonIndex
        for (int index : mostCommonIndex)
        {

            // For special letters
            for (int i = 0; i <= 2; i++)
            {

                if (index == (i + 26) && !mostCommonChar.contains(specialChar[i]))
                {
                    mostCommonChar.add(specialChar[i]);
                }


            }


            // For letters
            for (int i = 0; i <= 26; i++)
            {
                if (index == i && !mostCommonChar.contains(normalChar[i]))
                {
                    mostCommonChar.add(normalChar[i]);
                }
            }

        }

        // Check if list of most common chars is empty
        if (mostCommonChar.isEmpty())
        {
            // If empty, return the following as it is the implication
            return ("The most common character is the sum of non-letters.");
        }
        else
        {
            // If not empty, return the items of the list
            return ("Most common characters: " + mostCommonChar);
        }




        /*
        // Check if the most common character is one of the special characters
        for (int j = 0; j <= 2; j++) {
            int charCount = numOfSigns.get(j + 26);
            boolean isGreater = true;


            for (int number : numOfSigns) {
                if (charCount < number) {
                    isGreater = false;
                    break;
                }

            }
            // If charCount is not less than any item in numOfSigns, set corresponding character as most common
            if (isGreater) {
                int counter = 0;
                for (int number : numOfSigns) {
                    if (charCount == number && counter != j + 26) {
                        //mostCommonChar.add()
                        //mostCommon = "There are several most common characters.";

                        // Add special character and other most common characters' indices to list
                        mostCommonIndex.add(j + 26);
                        mostCommonIndex.add(counter);

                        break;
                    } else {
                        //FIX THIS
                        mostCommonIndex.add(j + 26);
                    }
                    counter++;
                }
            }
        }

        // Check if the most common character is a letter A through Z
        int k = 0;
        for (char character = 'A'; character <= 'Z'; character++)
        {
            int charCount = numOfSigns.get(k);
            boolean isGreater = true;

            // Check if instances of character is less than instances of any other character in numOfSigns


            for (int number : numOfSigns)
            {
                if (charCount < number)
                {
                    isGreater = false;
                    break;
                }
            }

            // If charCount is not equal to any other item in numOfSigns, print character. Otherwise, print statement
            if (isGreater)
            {
                int counter = 0;
                for (int number : numOfSigns)
                {
                    if (charCount == number && counter != k)
                    {
                        mostCommon = "There are several most-common characters";
                        break;
                    }
                    else
                    {
                        mostCommon = String.valueOf(character);
                    }
                    counter++;
                }

            }

            k++;

         */

        //return mostCommon;
    }


}
