import java.util.*;

public class Feed {
    private HashMap<String, User> users;
    private PriorityQueue<Post> feedQueue;

    public Feed() {
        this.users = new HashMap<>();
        this.feedQueue = new PriorityQueue<>(
            (Post p1, Post p2) -> {
                int p1Score = p1.getLikes() + p1.getComments();
                int p2Score = p2.getLikes() + p2.getComments();
                return p2Score - p1Score;
            }
        );
    }

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void generateFeed(String userId) {
        User user = users.get(userId);
        if (user != null) {
            for (String friendId : user.getFriends()) {
                User friend = users.get(friendId);
                if (friend != null) {
                    for (Post post : friend.getPosts().values()) {
                        feedQueue.add(post);
                    }
                }
            }
        }
    }

    public void displayFeed() {
        while (!feedQueue.isEmpty()) {
            System.out.println(feedQueue.poll());
        }
    }
}
