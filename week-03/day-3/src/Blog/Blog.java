package Blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<BlogPost> blogLists;


    public Blog() {
        this.blogLists = new ArrayList<>();
    }

    public void addBlogPost(BlogPost blogAdd) {
        blogLists.add(blogAdd);
    }

    public void delete(int index) {
        if (blogLists.size() - 1 > index && blogLists.size() > 0) {
            blogLists.remove(index);
        }
    }

    public void update(int index, BlogPost bp) {
        if (index <= blogLists.size()) {
            blogLists.set(index, bp);
        }
    }

}
