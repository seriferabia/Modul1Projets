package simpleEx.ex5;

import simpleEx.ex1.Printer;

public class MagazineApplication {
    public static void main(String[] args) {
        Editor editor =new Editor();
        Magazine magazine = editor.writeMagezine();

        Printer printer = new Printer();
        printer.printMagazine(magazine);
    }
}
