import java.util.LinkedList;
import java.util.List;

public class ElementUtils
{


    public static  <T> List<T> allMatches(List<T> list, Predicate<T> predicate)
    {
        List<T> newList = new LinkedList<>();


        for(T str : list)
        {
            if(predicate.compare(str))
            {
                newList.add(str);
            }
        }

        return newList;

    }



    public static <T,R> List<R> transformedList(List<T> list, Function<T,R> function)
    {
        List<R> newList = new LinkedList<>();

        for(T str : list)
        {
            newList.add(function.compare(str));
        }

        return newList;
    }
}
