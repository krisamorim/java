public class leson08whileAnddowhile {
    public static void main(String[] args) {
        var count = 0;
        while (count<10){
            System.out.println(++count);
        }

        //"do-while" will be run at least once even if the condition is false
        do {
            System.out.println("I'm into do-while");
        }while (count<10);
    }
}
