package functionalprogramming;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer, Double> sqrt = n-> Math.sqrt(n);
        System.out.println(" Square root of 64:"+ sqrt.apply(64));

        Function<String, String> lowerCaseFunction = (s)->s.toLowerCase();
        System.out.println(lowerCaseFunction.apply("PROGRAMMING"));
        Function<String, String> concatFunction= (s)-> s.concat("in Java");
        System.out.println(concatFunction.apply("programming "));

        System.out.println(lowerCaseFunction.andThen(concatFunction).apply("PROGRAMMING"));
    }
}
