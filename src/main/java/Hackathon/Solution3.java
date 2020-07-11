package Hackathon;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num;
        int count = 0;
        int bullet=1;
        num = in.nextInt();
        List<String> para = new ArrayList<>(num);
        for (int i = 0; i <= num; i++) {
            para.add(in.nextLine());
        }
        System.out.println();
        for (String a : para) {
            if (a.startsWith("# ")) {
                count++;
                bullet=1;
                a= a.replace("# ", count + ".");
                System.out.println(a);


            }
            if (a.startsWith("## ")) {
                a= a.replace("## ", count + "."+ bullet+".");
                System.out.println(a);
                bullet++;
            }
        }
    }
}