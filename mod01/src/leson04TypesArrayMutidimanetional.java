public class leson04TypesArrayMutidimanetional {
    public static void main(String[] args) {
        int[][] numbers = {{1,2},{3,4,5},{6,7,8,9}};
//        System.out.println(numbers[0]); //position on memory
//        System.out.println(numbers[0][0]);
//        System.out.println(numbers[1][0]);

        var count = 1;
        for (int[] num : numbers){// it's necessary inform []
            System.out.print("\nGroup "+count+": ");
            count++;
            for(int n : num){
                System.out.print(n+ " ");
            }
        }
    }
}
