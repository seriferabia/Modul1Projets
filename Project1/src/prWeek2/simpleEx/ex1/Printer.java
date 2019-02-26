package simpleEx.ex1;

import simpleEx.ex5.Magazine;

import java.util.List;

public class Printer {
    public void print(Article article){
        System.out.println("The title of the article is "+ article.getTitle());
        System.out.println("The text of the article is "+ article.getText());

    }
    public void printMagazine(Magazine magazine){
        System.out.println(magazine.getTitle());

        List<Article> articles = magazine.getArticles();
        for(Article article : articles){
            System.out.println(article.getTitle());
            System.out.println(article.getText());
        }
    }
}
