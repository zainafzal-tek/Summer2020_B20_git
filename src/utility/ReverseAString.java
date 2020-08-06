package utility;

public class ReverseAString {

    public static void main(String[] args) {

        String a = "JAVA";
        String revers = "";

        for (int i = a.length() - 1; i >= 0; i--){
            revers += a.charAt(i);
        }
        System.out.println(revers);

    }

}
