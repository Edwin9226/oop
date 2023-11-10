package functionalprogramming;

import java.util.function.*;

public class UnaryOperatorClass {

    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = i-> i*100;
        System.out.println(unaryOperator.apply(10));

        Function<Integer, Integer> function= i-> i*10;
        System.out.println(function.apply(100));

        IntUnaryOperator intUnaryOperator = i->i*10;
        System.out.println(intUnaryOperator.applyAsInt(100));

        LongUnaryOperator longUnaryOperator= i->i*10;
        System.out.println(longUnaryOperator.applyAsLong(10000000l));

        DoubleUnaryOperator doubleUnaryOperator= i-> i*10;
        System.out.println(doubleUnaryOperator.applyAsDouble(2000.20000));
    }
}
