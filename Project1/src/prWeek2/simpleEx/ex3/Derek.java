package simpleEx.ex3;

public class Derek {
    private Tool tool= new Tool(" ");

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public boolean canHangPainting(){
        return tool.getName().equals("hammer");
    }

    public void hangPainting(){
        if(canHangPainting()){
            System.out.println("I can hang the painting :)");
        }else{
            System.out.println("I am missing the hammer!");
        }
    }
}
