public class book {
    private String name;
    private String author;
    private short year;
    private String publisher;
    private String genre;
    private short countPages;

    public book(String name, String author, short year, String publisher, String genre, short countPages) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.countPages = countPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public short getCountPages() {
        return countPages;
    }

    public void setCountPages(short countPages) {
        this.countPages = countPages;
    }

    @Override
    public String toString()
    {
        return this.name + " "+ author+ " "+year " год издания";

    }

}
