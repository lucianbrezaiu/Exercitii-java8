import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Test
{



    public static void main(String[] args)
    {
        int n = 10;
        double[] array = new Random().doubles(0,1).limit(n).toArray();


        //Arrays.stream(array).forEach(System.out::println);


        double sum1 = DoubleStream.of(array).map(Math::sqrt).sum();
        //System.out.println(sum1);



        double sum2 = DoubleStream.of(array).map(Math::sqrt).parallel().sum();
        //System.out.println(sum2);

        //Stream<Double> infiniteStream = Stream.generate(Math::random);


        Stream<Double> infiniteStream = Stream.generate(new Random()::nextDouble);

        //infiniteStream.limit(5).collect(Collectors.toList()).forEach(System.out::println);

        //List<Double> list =  infiniteStream.limit(10).collect(Collectors.toList());
        //System.out.println(list);

        Double[] array2 = infiniteStream.limit(20).toArray(Double[]::new);
        System.out.println(Arrays.asList(array2));

    }

}
