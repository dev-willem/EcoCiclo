package br.edu.ifrn.ecociclo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "save")
public class Save {
    @SequenceGenerator(name = "save_id_gen", sequenceName = "post_id_seq", allocationSize = 1)
    @EmbeddedId
    private SaveId id;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @MapsId("postId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "postId", nullable = false)
    private Post post;

    @ColumnDefault("now()")
    @Column(name = "savedAt", nullable = false)
    private OffsetDateTime savedAt;

}
