package prWeek3.ex2;

import prWeek3.ex1.Customer;

public class TemplateChooser {

    public String chooseTemplate(Customer customer){
        String name = customer.getName().trim();
        if(name.contains("Hokopoko")){
            return "privileged";
        }else if(name.startsWith("Ms.") || name.startsWith("Mrs.")){
            return "woman";
        } else if(name.startsWith("Mr.")){
            return "man";
        }else{
            return "default";
        }
    }
}
