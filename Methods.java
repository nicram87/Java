public class Methods {
    static void checkAge(int age) {
        if (age < 18){
        System.out.println("You are not old enough");
    } else{
             System.out.println("You are old enough!");
        }
    }
    public static void main(String[] args){
        checkAge(20);
    }
}
