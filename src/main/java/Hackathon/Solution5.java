package Hackathon;
import java.util.*;

public class Solution5 {

    public static void main(String[] args)
    {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of projects");
            int num = scan.nextInt();

            System.out.println("Enter the number of elements in project");
            int num_of_elements = scan.nextInt();

            System.out.println("Enter all the elements of the project:");
            int projects_IDs[] = new int[num_of_elements];
            for (int i = 0; i < num_of_elements; i++) {
                projects_IDs[i] = scan.nextInt();
            }
            System.out.println("Enter the number of elements in bid");
            int num_of_bids = scan.nextInt();
            int bid_IDs[] = new int[num_of_bids];
            System.out.println("Enter all the elements of the project:");
            for (int i = 0; i < num_of_bids; i++) {
                bid_IDs[i] = scan.nextInt();
            }
            System.out.println(minCost(num,projects_IDs,bid_IDs));

    }

    static long minCost(int num,int projects_IDs[],int bid_IDs[]){
        long minCost=0;
        if(projects_IDs.length==bid_IDs.length) {
            Map<Integer, List<Integer>> projectBidMap = new HashMap<Integer,List<Integer>>();
            for (int i = 0; i < num; i++) {
                List<Integer> bidList = new LinkedList<>();
                for (int j = 0; j < projects_IDs.length; j++) {
                    if (i == projects_IDs[j]) {
                        bidList.add(bid_IDs[j]);
                    }
                }
                projectBidMap.put(i, bidList);
            }
            for (Map.Entry<Integer,List<Integer>> entry : projectBidMap.entrySet()) {
                if (null != entry.getValue() && entry.getValue().size() > 0) {
                    minCost += Collections.min(entry.getValue());
                }else{
                    break;
                }
            }
            minCost= (minCost==0)?-1:minCost;
        }
        else{
            minCost=-1;
            }
        return minCost;
    }
}
