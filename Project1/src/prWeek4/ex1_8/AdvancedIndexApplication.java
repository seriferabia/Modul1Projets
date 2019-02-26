package prWeek4.ex1_8;

import javax.sound.midi.Soundbank;
import java.util.*;

public class AdvancedIndexApplication {
    public static void main(String[] args) {
        Map<Integer, List<Topic>> index= new HashMap<>();
        System.out.println(index);
        Topic topic1 = new Topic("Economy");
        Topic topic2 = new Topic("History");
        Topic topic3 = new Topic("Science");
        List<Topic> topics1 = new ArrayList<>();
        List<Topic> topics2 = new ArrayList<>();
        topics1.add(topic1);
        topics2.addAll(Arrays.asList(topic2,topic3));
        index.put(1,topics1);
        index.put(2, topics2);
        System.out.println(index);
        System.out.println("Keys of index map are " + index.keySet());
        System.out.println("Values of index map are " + index.values());
        Topic topic4 = new Topic("Art");
        List<Topic> stored = index.get(1);
        stored.add(topic4);
        System.out.println(index);
        System.out.println("Does 1 exist as a key? " + index.containsKey(1));
        List<Topic> stored2 = index.get(2);
        System.out.println("The topics in page number 2 are " + stored2);
        System.out.println("The size of the index map is " + index.size());

    }
    public static class Topic{
        private String name;

        public Topic(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "text=" + name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Topic topic = (Topic) o;
            return Objects.equals(name, topic.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
