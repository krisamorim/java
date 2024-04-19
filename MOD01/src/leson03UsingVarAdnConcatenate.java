public class leson03UsingVarAdnConcatenate {
    public static void main(String[] args){
        //first case
        int age = 10;
        String name = "Kris";

        System.out.println("The name is "+name);
        System.out.println("The age is "+age);

        //second case
        var num1 = 10;
        var num2 = 20.0;
        System.out.println(num1+num2);
        System.out.println("Total is "+num1+num2);//number are text
        System.out.println(num1+num2+" is total");

    }
}
