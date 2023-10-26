package functionalprogramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        // print two numbers
        BiConsumer<Integer, Integer> biConsumer= (x,y)-> System.out.println("x:"+x+ "y: "+y);
        biConsumer.accept(3,4);

        // Calculating sum of two numbers
        BiConsumer<Integer, Integer> biConsumer1 = (x,y)-> System.out.println("x+y:"+ (x+y));
        biConsumer1.accept(3,5);

        // concatenate strings
        BiConsumer<String, String> biConsumer2 = (x, y)-> System.out.println(x+y);
        biConsumer2.accept("Prueba ", "de concatenar dos strings" );
    }

}
