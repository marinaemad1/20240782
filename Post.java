import java.util.ArrayList;
import java.util.List;

public class Post {
    private String author;
    private String content;
    private List<Comment> comments;

    public Post(String author, String content) {
        this.author = author;
        this.content = content;
        this.comments = new ArrayList<>();
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public String getAuthor() { return author; }
    public String getContent() { return content; }
    public List<Comment> getComments() { return comments; }
    public int getCommentCount() { return comments.size(); }
}
