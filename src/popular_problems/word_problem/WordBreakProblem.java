package popular_problems.word_problem;


import java.util.*;

// Recursive implementation of
// word break problem in java
public class WordBreakProblem
{

    // set to hold dictionary values
    private static Set<String> dictionary = new HashSet<>();

    public static void main(String []args)
    {

        // array of strings to be added in dictionary set.
        String temp_dictionary[] = {"mobile","samsung","sam","sung",
                "man","mango","icecream","and",
                "go","i","like","ice","cream"};

        // loop to add all strings in dictionary set
        for (String temp :temp_dictionary)
        {
            dictionary.add(temp);
        }

        // sample input cases
        System.out.println(wordBreak("ilikesamsung"));
        System.out.println(wordBreak("iiiiiiii"));
        System.out.println(wordBreak(""));
        System.out.println(wordBreak("ilikelikeimangoiii"));
        System.out.println(wordBreak("samsungandmango"));
        System.out.println(wordBreak("samsungandmangok"));

    }

    public static boolean wordBreak(String word)
    {
        int size = word.length();

        if (size == 0)
            return true;

        for (int i = 1; i <= size; i++)
        {


            if (dictionary.contains(word.substring(0,i)) &&
                    wordBreak(word.substring(i,size)))
                return true;
        }

        return false;
    }
}

