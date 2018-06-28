import java.util.Arrays;

public class Test
{
    public static void main(String[] args)
    {
        //basicLambdas();

        //lambdaInterface();

        lambdaGenericInterface();
    }


    public static void basicLambdas()
    {
        String[] stringArray = { "Mihnea" , "Dragos" ,"Adrian", "Luci", "Maria", "Elena", "Ale" , "Loredana"};



        Arrays.sort(stringArray, (first,second)-> Integer.compare(first.length(),second.length())  );
        System.out.println("\nLength (i.e., shortest to longest): " + Arrays.asList(stringArray));



        Arrays.sort(stringArray, (second,first)-> Integer.compare(first.length(),second.length())  );
        System.out.println("\nLength (i.e., shortest to longest): " + Arrays.asList(stringArray));



        Arrays.sort(stringArray, (first,second)-> Character.compare(first.charAt(0),second.charAt(0)));
        System.out.println("\nAlphabetically by the first character only: " + Arrays.asList(stringArray));



        Arrays.sort(stringArray, (first,second)-> first.contains("e") && !second.contains("e") ? -1 : 1    );
        System.out.println("\nStrings that contain “e” first, everything else second: " + Arrays.asList(stringArray));



        Arrays.sort(stringArray, (s1,s2) -> Utils.myMethod(s1,s2));
        System.out.println("\nStrings that contain “e” first, everything else second: " + Arrays.asList(stringArray));

    }


    public static void  lambdaInterface()
    {
        String string1 = "ac";
        String string2 = "balon";

        String longer = Utils.betterString(string1,string2, (s1,s2)-> s1.length() > s2.length());
        System.out.println("\nlonger: " + longer);


        String first = Utils.betterString(string1, string2, (s1, s2) -> true);
        System.out.println("\nfirst: " + first);
    }


    public static void lambdaGenericInterface()
    {
        String string1 = "ac";
        String string2 = "balon";

        String longer = Utils.betterEntry(string1,string2, (s1,s2)-> s1.length() > s2.length());
        System.out.println("\nlonger: " + longer);


        String first = Utils.betterEntry(string1, string2, (s1, s2) -> true);
        System.out.println("\nfirst: " + first);
    }
}
