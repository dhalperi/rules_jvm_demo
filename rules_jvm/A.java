import java.util.List;
import com.google.common.collect.ImmutableList;

public class A {
    public static final ImmutableList<Integer> INTEGERS = ImmutableList.of(1,2,3);
    public static void main(String[] args) {
        System.err.println(INTEGERS);
    }
}
