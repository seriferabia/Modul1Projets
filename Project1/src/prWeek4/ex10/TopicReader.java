package prWeek4.ex10;



import prWeek4.ex1_8.AdvancedIndexApplication;
import prWeek4.ex9.FileReader;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopicReader {
    private FileReader fileReader = new FileReader();

    public List<AdvancedIndexApplication.Topic> getTopics(FileReader fileReader){
        List<String> lines = fileReader.getLines("prWeek4/ex10/topics.txt");
        List<AdvancedIndexApplication.Topic> topics = lines.stream().map(toTopic()).collect(Collectors.toList());
        return topics;

    }

    private Function<String, AdvancedIndexApplication.Topic> toTopic() {
        return line -> new AdvancedIndexApplication.Topic(line);
    }
}
