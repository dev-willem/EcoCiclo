package br.edu.ifrn.ecolink.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "repost")
public class Repost {
    @SequenceGenerator(name = "repost_id_gen", sequenceName = "repost_id_seq", allocationSize = 1)
    @EmbeddedId
    private RepostId id;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @MapsId("postId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "postId", nullable = false)
    private Post post;

    @ColumnDefault("now()")
    @Column(name = "retweetedAt", nullable = false)
    private OffsetDateTime retweetedAt;

}
