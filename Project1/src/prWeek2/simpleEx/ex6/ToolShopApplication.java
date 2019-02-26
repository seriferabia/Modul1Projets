package simpleEx.ex6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToolShopApplication {
    public static void main(String[] args) {

        List<String> tools = Arrays.asList("hammer", "pliers", "wrench").stream().collect(Collectors.toList());
        ShopAssistant shopAssistant = new ShopAssistant();
        shopAssistant.findToolBox("red", tools);
    }

}
