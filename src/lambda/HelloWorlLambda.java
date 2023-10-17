package lambda;

public class HelloWorlLambda {

    public static void main(String[] args) {

        HelloWorldInterface helloWorldInterface= ()->{
            return "hello World";
        };
        System.out.println(helloWorldInterface.sayHelloWorld());
    }


}
