import java.util.Date;

public class Post {
    private String postId;
    private String userId;
    private String content;
    private Date timestamp;
    private int likes;
    private int comments;

    // Constructor
    public Post(String postId, String userId, String content, Date timestamp) {
        this.postId = postId;
        this.userId = userId;
        this.content = content;
        this.timestamp = timestamp;
        this.likes = 0;
        this.comments = 0;
    }

    // Getters
    public String getPostId() {
        return postId;
    }

    public String getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public int getLikes() {
        return likes;
    }

    public int getComments() {
        return comments;
    }

    // Methods to like and comment
    public void like() {
        this.likes++;
    }

    public void comment() {
        this.comments++;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Post{" +
                "postId='" + postId + '\'' +
                ", userId='" + userId + '\'' +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                ", likes=" + likes +
                ", comments=" + comments +
                '}';
    }
}
