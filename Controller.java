public class PostController {
    private Post model;
    private PostView view;

    public PostController(Post model, PostView view) {
        this.model = model;
        this.view = view;
    }

    public void addComment(String author, String text) {
        model.addComment(new Comment(author, text));
    }

    public void updateView() {
        int count = model.getCommentCount();
        String[][] commentsData = new String[count][2];
        for (int i = 0; i < count; i++) {
            commentsData[i][0] = model.getComments().get(i).getAuthor();
            commentsData[i][1] = model.getComments().get(i).getText();
        }
        view.displayPost(model.getAuthor(), model.getContent(), count, commentsData);
    }
}
