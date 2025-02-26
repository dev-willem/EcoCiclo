package br.edu.ifrn.ecociclo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serial;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class RepostId implements java.io.Serializable {
    @Serial
    private static final Long serialVersionUID = 20231041110003L;
    @Column(name = "userId", nullable = false)
    private Long userId;

    @Column(name = "postId", nullable = false)
    private Long postId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RepostId entity = (RepostId) o;
        return Objects.equals(this.userId, entity.userId) &&
                Objects.equals(this.postId, entity.postId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, postId);
    }

}
