package br.edu.ifrn.ecociclo.dto;

import br.edu.ifrn.ecociclo.model.Post;
import br.edu.ifrn.ecociclo.model.User;

import java.time.OffsetDateTime;

public record PostDTO(Long id, String text, String video, String image, User userId, Post repostId,
                      OffsetDateTime createdAt, Long countLikes, Long countRetweets, Long countComments) {
}
