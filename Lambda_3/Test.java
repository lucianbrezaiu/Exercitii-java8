import java.util.Arrays;
import java.util.List;

public class Test
{

    public static void main(String[] args)
    {

        List<String> words = Arrays.asList("facultate","mar","para","firma","bacalaureat");


/*

        List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
        System.out.println(shortWords);

        List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
        System.out.println(wordsWithB);


        List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
        System.out.println(evenLengthWords);
*/



/*

        List<String> shortWords = ElementUtils.allMatches(words, s -> s.length() < 4);
        System.out.println(shortWords);

        List<String> wordsWithB = ElementUtils.allMatches(words, s -> s.contains("b"));
        System.out.println(wordsWithB);


        List<String> evenLengthWords = ElementUtils.allMatches(words, s -> (s.length() % 2) == 0);
        System.out.println(evenLengthWords);


        List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
        List<Integer> bigNums = ElementUtils.allMatches(nums, n -> n>500);

        System.out.println(bigNums);


*/



/*
        List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
        System.out.println(excitingWords);


        List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
        System.out.println(eyeWords);


        List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
        System.out.println(upperCaseWords);
*/


        List<Integer> wordLengths = ElementUtils.transformedList(words, String::length);
        System.out.println(wordLengths);

    }

}
