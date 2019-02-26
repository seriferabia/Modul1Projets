package Week3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex7 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("ball");
        list1.add("doll");
        list2.add("doll");
        list2.add("guitar");

        Map<String, List<String>> lists = getLists(list1, list2);

        System.out.println(lists.get("finallist"));
        System.out.println(lists.get("repeatedlist"));
    }
    public static Map<String, List<String>> getLists(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> finalList = list1;
        ArrayList<String> repeatedList = new ArrayList<>();

        for(String element:list2){
            if(finalList.contains(element)){
                repeatedList.add(element);
            }
            else {
                finalList.add(element);
            }
        }

        //ArrayList<String>[] arr = new ArrayList<String>[2];
        //arr[0] = finalList;
        //arr[1] = repeatedList;
        //return arr;

        Map<String,List<String>> map =new HashMap();
        map.put("finallist",finalList);
        map.put("repeatedlist",repeatedList);
        return map;
    }
}
