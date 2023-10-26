package functionalprogramming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // if number is >10 true other false
        Predicate<Integer> p1= (i)-> i>10;
        System.out.println(p1.test(5));

        // i>10 &&number is even Number (i%2)==0
        Predicate<Integer> p2=(i)-> i%2==0;
        System.out.println(p1.and(p2).test(50));

        // i>10 // number is even mumber (i%%2==0)
        System.out.println(p1.or(p2).test(4));

        //i>0 && i%2 !=0
        System.out.println(p1.and(p2.negate()).test(33));
    }
}
