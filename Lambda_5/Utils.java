import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Utils
{

    static List<Double> list(int size)
    {
        return new Random().doubles(0,1).limit(size).boxed().collect(Collectors.toList());
    }

    static Double avg(List<Double> list)
    {
        return list.stream().reduce( (a,b) ->a+b).get() / list.size();
    }

    static void cutoff(List<Double> list, double cutoff)
    {
        list.removeIf(x -> x<cutoff);
    }

    static List<Double> doubling(List<Double> list)
    {
        return list.stream().map(s -> s*2).collect(Collectors.toList());
    }

    static int countPrimes1(int upperBound)
    {
        if (upperBound <= 2)
        {
            return(1);
        }

        if (Primes.isPrime(upperBound))
        {
            return(1 + countPrimes1(upperBound - 1));
        }
        else
        {
            return(countPrimes1(upperBound - 1));
        }
    }

    static int countPrimes2(int upperBoundd)
    {
        // ????
        return 0;
    }

}
