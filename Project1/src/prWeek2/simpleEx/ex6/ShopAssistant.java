package simpleEx.ex6;

import simpleEx.ex3.Tool;

import java.util.List;

public class ShopAssistant {
    public ToolBox findToolBox(String color, List<String> toolNames){

        ToolBox toolBox = new ToolBox(color);
        for(String name : toolNames){
            toolBox.add(new Tool(name));
        }
        System.out.println("Your "+color+" toolbox is ready with tolls inside of it "+toolNames.get(0)+", "+toolNames.get(1)+", "+toolNames.get(2));
        return toolBox;

    }
}
