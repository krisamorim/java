
public class leson08forWithContinue {
    public static void main(String[] args){
        for(int i=0;i<50;i++){
            if (i%2==0){
                System.out.println("Dentro do if do for");
                continue; //volta para o inicio do for e ignora a linha10
            }
            System.out.println("dentro do for");

        }
    }
}
