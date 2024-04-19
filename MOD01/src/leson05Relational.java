public class leson05Relational {
    public static void main(String[] args){
        //relational
        System.out.println(10>20);
        System.out.println(10<20);
        System.out.println(10==20);
        System.out.println(10!=20);

        //And | OR
        var firstVerify = 10>20 && 10>30;
        var secondVerify = 10>20 || !(10>5);
        var thirdVerify = 10>20 || 10>5;
        System.out.println("10>20 AND 10>30: "+firstVerify);
        System.out.println("10>20 OR Ñ10>5: "+secondVerify);
        System.out.println("10>20 OR 10>5: "+thirdVerify);
    }
}