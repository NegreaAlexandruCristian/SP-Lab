public class Main {

    public static void main(String []args){

        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");

        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOne = chp1.createSubChapter("SubChapter 1.1");

        SubChapter subChapter = chp1.getSubChapter(indexSubChapterOne);
        subChapter.createElement(new Paragraph("Paragraph 1"));
        subChapter.createElement(new Paragraph("Paragraph 2"));
        subChapter.createElement(new Paragraph("Paragraph 3"));
        subChapter.createElement(new Image("Image 1"));
        subChapter.createElement(new Paragraph("Paragraph 4"));
        subChapter.createElement(new Table("Table 1"));
        subChapter.createElement(new Paragraph("Paragraph 5"));

        subChapter.print();
    }
}
