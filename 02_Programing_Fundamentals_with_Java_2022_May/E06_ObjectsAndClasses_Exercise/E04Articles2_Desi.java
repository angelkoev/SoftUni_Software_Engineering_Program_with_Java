package E06_ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E04Articles2_Desi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Article> articles = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            String[] articleData = scanner.nextLine().split(", ");
            String title = articleData[0];
            String content = articleData[1];
            String author = articleData[2];
            Article article = new Article(title, content, author);
            articles.add(article);
        }

        String type = scanner.nextLine();
        switch (type) {
            case "title":
//                articles.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
//                articles.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
//                articles.sort(Comparator.comparing(Article::getAuthor));
                break;
        }

        articles.forEach(System.out::println);
    }

    static class Article {
        private String title;
        private String content;
        private String author;

        public Article() {

        }

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void edit(String newContent) {
            this.content = newContent;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }

        public void rename(String newTitle) {
            this.title = newTitle;
        }

        @Override
        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }
    }
}