package Hackathon;
import java.util.*;

public class Solution8 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        s.nextLine();
        int input[] = new int[count];
        for (int i = 0; i < count; i++) {
            input[i] = s.nextInt();
        }
        reassignedPriorities(input);
        }


    private static void reassignedPriorities(int priorities[]){
        Integer[] prioritiesList = new Integer[priorities.length];
        for (int i = 0; i < priorities.length; i++) {
            prioritiesList[i] = Integer.valueOf(priorities[i]);
        }
        Arrays.sort(prioritiesList);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(prioritiesList) );
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
        Map<Integer,Integer> sortedMap = new HashMap<Integer,Integer>();
        int count = 1;
        for(int i :numbersWithoutDuplicates){
            sortedMap.put(count++,i);
        }

        List<Integer> subset = new ArrayList<>();
        for(int i :priorities){
            for (Map.Entry<Integer,Integer> entry : sortedMap.entrySet())
            {
                if(i==entry.getValue()){
                    subset.add(entry.getKey());
                }
            }
        }
        System.out.println(subset);
    }
}
