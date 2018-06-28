import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FunctionUtils
{

    static <T> T firstAllMatch(Stream<T> stream, Predicate<T>... predicates)
    {
        List<T> filteredList = stream.collect(Collectors.toList());
        List<T> aux = new LinkedList<>();

        for(T str : filteredList)
        {
            boolean ok = true;
            for(Predicate predicate : predicates)
            {
                if(!predicate.filter(str))
                {
                    ok = false;
                }
            }
            if(ok)
            {
                return str;
            }
        }
        return null;
    }



    static <T> T firstAnyMatch(Stream<T> stream, Predicate<T>... predicates)
    {
        TreeSet<T> set = new TreeSet<>();

        List<T> list =  stream.collect(Collectors.toList());

        for(Predicate predicate : predicates)
        {
            for (T str : list)
            {
                if (predicate.filter(str))
                {
                    return str;
                }
            }
        }
        return null;
    }

}
