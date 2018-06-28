import java.util.Arrays;
import java.util.List;

public class Test
{

    public static void main(String[] args)
    {

        //example();

        List<String> words = Arrays.asList("hi", "hello", "bye", "goodbye");
        String str = FunctionUtils.firstAllMatch(words.stream(), word -> word.contains("b"),  word -> word.length() < 5);
        System.out.println(str);



        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Integer perfect = FunctionUtils.firstAllMatch(numbers.stream(), nr -> nr%2==1,  nr -> nr >=6);
        System.out.println(perfect);


/*
        List<String> words = Arrays.asList("hi", "hello", "bye", "goodbye");
        String str = FunctionUtils.firstAnyMatch(words.stream(), word -> word.contains("b"),  word -> word.length() < 5);
        System.out.println(str);



        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Integer perfect = FunctionUtils.firstAnyMatch(numbers.stream(), nr -> nr%2==1,  nr -> nr >3);
        System.out.println(perfect);

*/
    }


    static int doAdd(int... values)
    {
        int sum = 0;
        for(int i=0;i<values.length;i++)
        {
            sum += values[i];
        }
        return sum;
    }

    static void example()
    {
        List<String> words = Arrays.asList("hi", "hello", "bye", "goodbye");

        String s1 = words.stream()
                .filter(word -> word.contains("o"))
                .findFirst()
                .orElse(null);

        System.out.println(s1);



        String s2 = words.stream()
                .filter(word -> word.length() > 5)
                .findFirst()
                .orElse(null);


        System.out.println(s2);
    }


}
