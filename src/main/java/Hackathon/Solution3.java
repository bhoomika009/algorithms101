package Hackathon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        String [] paragraph = new String[num];
        for (int i = 2; i < num+1; i++) {

            paragraph[i]=in.nextLine();
            System.out.println(i+"----------"+paragraph[i]);
        }
        System.out.println(Arrays.toString(paragraph));
        System.out.println(Arrays.toString(tableOfContents(paragraph)));
    }

    static String [] tableOfContents(String [] paragraph){
        String [] modifiedparagraph = new String[paragraph.length];
        int count = 0;
        int bullet=1;
        for (int a=0; a<paragraph.length; a++) {
            if (paragraph[a].startsWith("# ")) {
                count++;
                bullet = 1;
                paragraph[a] = paragraph[a].replace("# ", count + ".");
                modifiedparagraph[a]=paragraph[a];
            }
            if (paragraph[a].startsWith("## ")) {
                paragraph[a] = paragraph[a].replace("## ", count + "." + bullet + ".");
                modifiedparagraph[a]=paragraph[a];
                bullet++;
            }
        }
        List<String> list = new ArrayList<String>();

        for(String s : modifiedparagraph) {
            if(s != null && s.length() > 0) {
                list.add(s);

            }
        }

        modifiedparagraph = list.toArray(new String[list.size()]);
        return modifiedparagraph;
    }
}