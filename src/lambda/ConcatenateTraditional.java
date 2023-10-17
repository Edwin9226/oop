package lambda;

public class ConcatenateTraditional implements ConcatenateInterface{
    @Override
    public String sconcant(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        ConcatenateTraditional concatenateTraditional= new ConcatenateTraditional();
        System.out.println(concatenateTraditional.sconcant("Prueba", "esto"));
    }
}
