import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Feed feed = new Feed();

        // Creating users
        User user1 = new User("U001", "Alice");
        User user2 = new User("U002", "Bob");
        User user3 = new User("U003", "Charlie");

        // Adding friends
        user1.addFriend("U002");
        user1.addFriend("U003");

        // Creating posts
        Post post1 = new Post("P001", "U002", "Bob's first post!", new Date());
        Post post2 = new Post("P002", "U003", "Charlie is here!", new Date());

        // Adding posts to users
        user2.addPost(post1);
        user3.addPost(post2);

        // Adding users to feed system
        feed.addUser(user1);
        feed.addUser(user2);
        feed.addUser(user3);

        // Generating and displaying feed for user1
        feed.generateFeed("U001");
        feed.displayFeed();
    }
}
