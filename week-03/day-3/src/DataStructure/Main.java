package DataStructure;

public class Main {

    public static void main(String[] args) {

        //Post-It
        PostIt post1 = new PostIt();
        post1.backgroundColor = "Orange";
        post1.textColor = "Blue";
        post1.text = "Idea 1";
        post1.print();

        PostIt post2 = new PostIt();
        post2.backgroundColor = "Pink";
        post2.textColor = "Black";
        post2.text = "Awesome";
        post2.print();

        PostIt post3 = new PostIt();
        post3.backgroundColor = "Yellow";
        post3.textColor = "Green";
        post3.text = "Superb!";
        post3.print();

        System.out.println();

        //BlogPost
        BlogPost bPost1 = new BlogPost();
        bPost1.title = "\"Lorem Ipsum\"";
        bPost1.authorName = "John Doe";
        bPost1.publicationDate = "\"2000.05.04\"";
        bPost1.text = "\tLorem ipsum dolor sit amet";
        bPost1.write();

        BlogPost bPost2 = new BlogPost();
        bPost2.title = "\"Wait but why\"";
        bPost2.authorName = "Tim Urban";
        bPost2.publicationDate = "\"2010.10.10\"";
        bPost2.text = "\tA popular long-form, stick-figure-illustrated blog about almost everything";
        bPost2.write();

        BlogPost bPost3 = new BlogPost();
        bPost3.title = "\"One Engineer Is Trying to Get IBM to Reckon With Trump\"";
        bPost3.authorName = "William Turton";
        bPost3.publicationDate = "\"2017.03.28\"";
        bPost3.text = "\tDaniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to \n take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole \n organizer profile thing.";
        bPost3.write();

    }

}
