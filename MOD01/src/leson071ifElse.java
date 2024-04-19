
public class leson071ifElse {
    public static void main(String[] args) {
        int ageToGetInRollerCoast = 18;
        float heightToGetOnRollerCoast = 1.5F;

        if (ageToGetInRollerCoast<18) {
            System.out.println("You not old enough to get in the rollercoast");
        }else if (ageToGetInRollerCoast >= 18){
            System.out.println("You're old enough to get in the rollergoast");
        }

        if (heightToGetOnRollerCoast<1.5f){
            System.out.println("You're not tall enough to get in");
        }else{
            System.out.println("you are tall enough to get in the rollercosast");
        }

        if (ageToGetInRollerCoast >=18 && heightToGetOnRollerCoast >= 1.5F){
            System.out.println("You're allowed to get in");
        }
    }
}
