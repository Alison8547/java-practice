package secao13.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private final DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();

    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Post() {
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(title).append("\n");
        sb.append(likes).append(" Likes").append(" - ").append(moment.format(dtf2)).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments:" + "\n");
        for (Comment comment : comments) {
            sb.append(comment.getText()).append("\n");
        }

        return sb.toString();

    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Integer getLikes() {
        return likes;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
