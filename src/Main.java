import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str, find, message = "";

        System.out.printf("Enter string: ");
        str = scanner.nextLine();

        int count = 0;
        System.out.printf("Nhap vao ky tu can tim: ");
        find = scanner.next();

        for(int i = 0; i < str.length(); i++){
            if((str.charAt(i)+"").equals(find)){
                count++;
            }
        }

        if(count==0){
            message+="Can't find this character in the string";
        }else{
            message="has " + count + " character " + find + " in the string ";
        }
        System.out.printf(message);
    }
}
