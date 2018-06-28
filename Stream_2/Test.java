import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test
{


    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("hi", "hello", "bye", "goodbye");





        String concat1 = words.stream().reduce((x,y) -> x.toUpperCase() + y.toUpperCase()).get();
        System.out.println(concat1);





        String concat2 = words.stream().map(String::toUpperCase).reduce((x,y)->x+y).get();
        System.out.println(concat2);





        String concat3 = words.stream().reduce((x,y) -> x.toUpperCase() + "," + y.toUpperCase()).get();
        System.out.println(concat3);





        int lengths = words.stream().mapToInt(String::length).sum();
        System.out.println(lengths);





        long number = words.stream().filter(s -> s.contains("h")).count();
        System.out.println(number);


    }

}
