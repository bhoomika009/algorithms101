package Hackathon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution1
{

    private static int countCounterfeit(String arrayOfSerialNumber[]){
        int sum = 0;
            for (String s : arrayOfSerialNumber) {
                if (s.length() > 9 && s.length() < 13) {
                    String d = s.substring(7, s.length()-1);
                    String e = s.substring(3, 7);
                    if (d.chars().allMatch(Character::isDigit) && e.chars().allMatch(Character::isDigit) ){
                        int denominationNumber = Integer.parseInt(d);
                        int isValidyear = Integer.parseInt(e);
                        char[] charArray = s.substring(0,3).toCharArray();
                    if (isStringUniqueUpperCase(charArray)
                            && findDuplicate(charArray)
                            && Test3(isValidyear)
                            && Test4(denominationNumber)
                            && Character.isUpperCase(s.charAt(s.length() - 1))) {
                        sum = sum + denominationNumber;
                    }
                }
                }
            }
            return sum;
    }


    private static boolean isStringUniqueUpperCase(char[] charArray){
        for(int i:charArray){
                if(!Character.isUpperCase(i))
                return false;
        }
        return true;
    }

    private static boolean findDuplicate(char[] chArray)
    {
        Arrays.sort(chArray);
        for (int i = 0; i < chArray.length - 1; i++) {
            if (chArray[i] != chArray[i + 1])
                continue;
            else
                return false;
        }
        return true;
    }

    private static boolean Test3(int x)
    {
        int min = 1900;
        int max = 2019;
        return x>min && x<=max;
    }

    private static boolean Test4(int x)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>(7);
        arr.add(10);
        arr.add(20);
        arr.add(50);
        arr.add(100);
        arr.add(200);
        arr.add(500);
        arr.add(1000);
        return arr.contains(x);
    }

    public static void main(String[] args)
    {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of elements in serialNumber");
            int num = scan.nextInt();
            String arrayOfSerialNumber[] = new String[num];
            System.out.println("Enter all the elements:");
            for (int i = 0; i < num; i++) {
                arrayOfSerialNumber[i] = scan.next();
            }

            System.out.println(countCounterfeit(arrayOfSerialNumber));
        }
        catch(Exception e){
            System.out.println("exception occured" + e.getStackTrace());
        }
    }
}