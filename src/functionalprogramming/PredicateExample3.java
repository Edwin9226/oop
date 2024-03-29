package functionalprogramming;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {
    public static void main(String[] args) {
        IntPredicate p1= (i)->i>100;
        System.out.println(p1.test(50));

        LongPredicate p2= (i)-> i>100L;
        System.out.println(p2.test(101l));

        DoublePredicate p3= (i)->i>100.25;
        DoublePredicate p4= (i)->i<100.50;
        System.out.println(p3.and(p4).test(100.35));
    }
}
