package simpleEx.ex5;

import simpleEx.ex1.Article;

public class Editor {
    public Magazine writeMagezine(){
        Article article1 = new Article("TITLE1", "teeeeeeeeeeeeeeeeeeeeeext1");
        Article article2 = new Article("TITLE2", "teeeeeeeeeeeeeeeeeeeeeext2");
        Article article3 = new Article("TITLE3", "teeeeeeeeeeeeeeeeeeeeeext3");
        Magazine magazine = new Magazine(">>>>>>>>>Journal<<<<<<<<<<");
        magazine.add(article1);
        magazine.add(article2);
        magazine.add(article3);
        return magazine;
    }
}
