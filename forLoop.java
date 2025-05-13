public class forLoop {
    public static void main(String[] args){
        for (int i = 0; i <= 5; i++){
            System.out.println("Number" + i);
            for (int f = 5; i >= 10; i--){
                System.out.println("Number: " + i);
                break;
            }
        }
    }
}
