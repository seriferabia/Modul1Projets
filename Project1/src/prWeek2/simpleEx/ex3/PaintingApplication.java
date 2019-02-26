package simpleEx.ex3;

public class PaintingApplication {
    public static void main(String[] args) {

        Derek derek = new Derek();
        derek.hangPainting();

        derek.setTool(new Tool("hammer"));
        derek.hangPainting();
    }
}
