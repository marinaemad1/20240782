public class Main {
    public static void main(String[] args) {

        Post post = new Post("Hassan", "YOLO!");


        PostView view = new PostView();


        PostController controller = new PostController(post, view);
        controller.updateView();

        System.out.println();

        controller.addComment("Omar", "widsom :D");
        controller.updateView();
    }
}
