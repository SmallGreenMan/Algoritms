import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaTest {
    public static void main(String []args){

        List<Double> ints = new ArrayList<Double>();
        List<? super Number> nums = ints;

        System.out.println("ok");
    }
}
