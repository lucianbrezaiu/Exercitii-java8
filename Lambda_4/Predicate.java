import java.util.List;

@FunctionalInterface
public interface Predicate<T>
{

    boolean filter(T element);

}
