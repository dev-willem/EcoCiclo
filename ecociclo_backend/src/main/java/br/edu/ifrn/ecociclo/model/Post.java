package br.edu.ifrn.ecociclo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_id_gen")
    @SequenceGenerator(name = "post_id_gen", sequenceName = "post_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "text")
    private String text;

    @Lob
    @Column(name = "video")
    private String video;

    @Lob
    @Column(name = "image")
    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "repostId")
    private Post repostId;

    @ColumnDefault("now()")
    @Column(name = "createdAt", nullable = false)
    private OffsetDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        if (createdAt == null) {
            this.createdAt = OffsetDateTime.now();
        }
    }
}
