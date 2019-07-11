package Blog;

public class BlogMain {

    public static void main(String[] args) {
        Blog blog = new Blog();

        blog.addBlogPost(new BlogPost("Torok Attila", "A kis Vuk", "Megette a kacsát", "2010.03.15"));
        blog.addBlogPost(new BlogPost("Kovacs Jeno", "Szia Mia", "Hello Bello", "2010.02.10"));
        blog.addBlogPost(new BlogPost("Kun Bela", "Cica a fan", "Felmaszott a fara", "1932.03.06"));
        blog.addBlogPost(new BlogPost("Szabo Karoly", "En vagyok", "Hol vagyok", "1942.04.07"));

        System.out.println("Size before delete: " + blog.blogLists.size());
        blog.delete(2);
        System.out.println("Size after delete: " + blog.blogLists.size());
        blog.update(4, new BlogPost("Cica Mica", "Hello hello", "Igen igen", "2010"));
        System.out.println("Size after update: " + blog.blogLists.size());
    }

}
