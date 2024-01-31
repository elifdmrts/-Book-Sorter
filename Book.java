public class Book implements Comparable<Book>{
private String title;
private int pageCount;
private String author;
private String publicationDate;

public Book(String title, int pageCount, String author, String publicationDate){
    this.title=title;
    this.pageCount=pageCount;
    this.author=author;
    this.publicationDate=publicationDate;

}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
    @Override
    public String toString() {
        return "Title: " + title + ", Page Count: " + pageCount + ", Author: " + author + ", Publication Date: " + publicationDate;
    }
}
