package secao13.test;

import secao13.domain.Comment;
import secao13.domain.Post;

import java.time.LocalDateTime;

public class PostTest {
    public static void main(String[] args) {
        Post post = new Post(LocalDateTime.now(),"Good night guys","See you tomorrow",5);
        post.addComment(new Comment("Good night"));
        post.addComment(new Comment("May the Force be with you"));

        System.out.println(post);
    }
}
