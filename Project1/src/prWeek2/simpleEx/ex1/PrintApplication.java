package simpleEx.ex1;

import java.util.ArrayList;

public class PrintApplication {
    public static void main(String[] args) {
        Article article = new Article("title", "text");
        Printer printer = new Printer();
        printer.print(article);
    }
}
