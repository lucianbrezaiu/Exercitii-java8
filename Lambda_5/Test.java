import java.util.List;

public class Test
{

    public static void main(String[] args)
    {
        average1();

        average2();

        System.out.println(Utils.countPrimes1(5000));

        System.out.println(Utils.countPrimes1(10000));
    }

    public static void average1()
    {
        List<Double> list = Utils.list(1000);

        System.out.println("average 1: " + Utils.avg(list));

        Utils.cutoff(list,0.5);

        System.out.println("average 2: " + Utils.avg(list));
    }



    public static void average2()
    {
        List<Double> list = Utils.list(1000);

        System.out.println("average 1: " + Utils.avg(list));

        list = Utils.doubling(list);

        System.out.println("average 2: " + Utils.avg(list));
    }





}
