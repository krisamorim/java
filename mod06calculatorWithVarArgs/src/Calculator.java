public class Calculator {
    public void sumInt(int... numbers){
        int total = 0;
        for (int n : numbers){
            total += n;
        }
        System.out.println("Total: "+total);
    }
}
