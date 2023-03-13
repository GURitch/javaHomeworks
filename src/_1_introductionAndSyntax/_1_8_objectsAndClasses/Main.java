package _1_introductionAndSyntax._1_8_objectsAndClasses;

class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Фёдор", "Достоевский");
        Author author2 = new Author("Михаил", "Булгаков");

        Book book1 = new Book("Идиот", author1, 1869);
        Book book2 = new Book("Мастер и Маргарита", author2, 194);

        book2.setPublishingYear(1940);

        System.out.println(author1);
        System.out.println();
        System.out.println(book2);
    }
}



