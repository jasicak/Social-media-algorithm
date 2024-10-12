import java.util.HashMap;
import java.util.LinkedList;

public class User {
    private String userId;
    private String name;
    private HashMap<String, Post> posts;
    private LinkedList<String> friends;

    // Constructor
    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.posts = new HashMap<>();
        this.friends = new LinkedList<>();
    }

    // Getters
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    // Add a post to the user's post collection
    public void addPost(Post post) {
        posts.put(post.getPostId(), post);
    }

    // Get all posts
    public HashMap<String, Post> getPosts() {
        return posts;
    }

    // Get the list of friends
    public LinkedList<String> getFriends() {
        return friends;
    }

    // Add a friend by ID
    public void addFriend(String friendId) {
        friends.add(friendId);
    }

    // Override toString method
    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", posts=" + posts +
                ", friends=" + friends +
                '}';
    }
}
