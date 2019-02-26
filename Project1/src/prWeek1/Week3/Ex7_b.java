package Week3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex7_b {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("ball");
        list1.add("doll");
        list2.add("doll");
        list2.add("guitar");

        List<List<String>> lists = getLists(list1, list2);

        System.out.println(lists.get(0));
        System.out.println(lists.get(1));
    }

    public static List<List<String>> getLists(List<String> list1, List<String> list2){
        List<String> finalList = list1;
        List<String> repeatedList = new ArrayList<>();

        for(String element:list2){
            if(finalList.contains(element)){
                repeatedList.add(element);
            }
            else {
                finalList.add(element);
            }
        }

        List<List<String>> lists = new ArrayList<>();
        lists.add(finalList);
        lists.add(repeatedList);
        return lists;

    }
}

