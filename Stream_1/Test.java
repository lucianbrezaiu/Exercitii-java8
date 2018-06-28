import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test
{


    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("hey","hello","bye","goodbye");




        words.stream().forEach(x -> System.out.println("  " + x));
        words.stream().forEach(System.out::println);






        List<String> excitingWords = words.stream().map(x -> x + "!").collect(Collectors.toList());
        System.out.println(excitingWords);

        List<String> eyeWords = words.stream().map(x -> x.replace("i","eye")).collect(Collectors.toList());
        System.out.println(eyeWords);

        List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseWords);





        List<String> shortWords = words.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
        System.out.println(shortWords);

        List<String> wordsWithB = words.stream().filter(s -> s.contains("b")).collect(Collectors.toList());
        System.out.println(wordsWithB);

        List<String> evenLengthWords = words.stream().filter(s -> (s.length()%2)==0).collect(Collectors.toList());
        System.out.println(evenLengthWords);





        List<String> output = words.stream().map(String::toUpperCase).filter(x -> x.length()<4).filter(x -> x.contains("E")).collect(Collectors.toList());
        System.out.println("output: " + output);


        List<String> output2 = words.stream().map(String::toUpperCase).filter(x -> x.length()<4).filter(x -> x.contains("Q")).collect(Collectors.toList());
        System.out.println("output2: " + output2);



        String[] array = words.stream().map(String::toUpperCase).filter(x -> x.length()<4).filter(x -> x.contains("E")).toArray(String[]::new);
        System.out.println(Arrays.asList(array));

    }
}
