package lambda;

public class HelloWorldTraditional implements HelloWorldInterface{
    @Override
    public String sayHelloWorld() {
        return "hello World";
    }

    public static void main(String[] args) {
        HelloWorldTraditional helloWorldTraditional = new HelloWorldTraditional();
        System.out.println(helloWorldTraditional.sayHelloWorld());
    }
}
