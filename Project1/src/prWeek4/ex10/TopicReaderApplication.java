package prWeek4.ex10;



import prWeek4.ex1_8.AdvancedIndexApplication;
import prWeek4.ex9.FileReader;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TopicReaderApplication {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        TopicReader topicReader = new TopicReader();
        List<AdvancedIndexApplication.Topic> topics= topicReader.getTopics(fileReader);
        System.out.println(topics);
        Set<AdvancedIndexApplication.Topic> setOfTopics = new HashSet<>(topics);
        System.out.println(setOfTopics);

    }
}
