package br.edu.ifrn.ecolink.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "tweetLikes")
public class PostLike {
    @SequenceGenerator(name = "tweetLikes_id_gen", sequenceName = "tweet_id_seq", allocationSize = 1)
    @EmbeddedId
    private PostLikeId id;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private User userId;

    @MapsId("postId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "postId", nullable = false)
    private Post post;

    @ColumnDefault("now()")
    @Column(name = "likedAt", nullable = false)
    private OffsetDateTime likedAt;

}
