public class Utils
{

    public static int myMethod(String s1, String s2)
    {
        if(s1.contains("e") && !s2.contains("e"))
        {
            return -1;
        }
        else  if(!s2.contains("e") && s2.contains("e"))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static String betterString(String s1, String s2, TwoStringPredicate predicate)
    {
        if(predicate.myCompare(s1,s2))
        {
            return s1;
        }
        else
        {
            return s2;
        }
    }

    public static <T> T betterEntry(T element1,T element2, TwoElementPredicate<T> predicate)
    {
        if(predicate.<T>myCompare(element1,element2))
        {
            return element1;
        }
        else
        {
            return element2;
        }
    }
}
