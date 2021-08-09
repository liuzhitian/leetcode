import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if("1".equals(s)){
            int count = 0;
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                if (!"".equals(str)) count++;
            }
            System.out.println(count);
        }else if("Q".equals(s)){
            System.out.println("Quit");
        }else {
            System.out.println("111");
        }
    }
}
