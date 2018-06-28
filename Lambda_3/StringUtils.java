import java.util.LinkedList;
import java.util.List;

public class StringUtils
{

    public static List<String> allMatches(List<String> list, Predicate<String> predicate)
    {
        List<String> newList = new LinkedList<>();


        for(String str : list)
        {
            if(predicate.compare(str))
            {
                newList.add(str);
            }
        }

        return newList;

    }


    public static List<String> transformedList(List<String> list, Function<String,String> function)
    {
        List<String> newList = new LinkedList<>();

        for(String str : list)
        {
            newList.add(function.compare(str));
        }

        return newList;
    }


}
