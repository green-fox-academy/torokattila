package DataStructure;

public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost() {

    }

    public void write() {
        System.out.print(this.title + " ");
        System.out.print(this.authorName + " ");
        System.out.println(this.publicationDate);
        System.out.println(this.text);
        System.out.println();
    }

}
