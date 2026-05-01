public class PostView {
    public void displayPost(String author, String content, int commentCount, String[][] comments) {
        System.out.println(author + " posted : " + content);
        System.out.println("number of comments : " + commentCount);
        for (String[] comment : comments) {
            System.out.println(comment[0] + " commented : " + comment[1]);
        }
    }
}
