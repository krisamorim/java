public class leson07ConditionalSwitchCase {
    public static void main(String[] args) {
        var gender = "X";

        switch (gender){
            case "M":
                System.out.println("You're a Man");
                break;
            case "W":
                System.out.println("You're a woman");
                break;
            default:
                System.out.println("This value is not allow");
        }
    }
}
