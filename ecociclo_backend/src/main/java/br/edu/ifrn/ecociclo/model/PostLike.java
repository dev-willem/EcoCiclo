package br.edu.ifrn.ecociclo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "postLikes")
public class PostLike {
    @SequenceGenerator(name = "postLikes_id_gen", sequenceName = "post_id_seq", allocationSize = 1)
    @EmbeddedId
    private PostLikeId id;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @MapsId("postId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "postId", nullable = false)
    private Post post;

    @ColumnDefault("now()")
    @Column(name = "likedAt", nullable = false)
    private OffsetDateTime likedAt;

}
