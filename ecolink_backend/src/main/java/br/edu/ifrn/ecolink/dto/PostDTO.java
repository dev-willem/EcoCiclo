package br.edu.ifrn.ecolink.dto;

import br.edu.ifrn.ecolink.model.Post;
import br.edu.ifrn.ecolink.model.User;

import java.time.OffsetDateTime;

public record PostDTO(Long id, String text, String video, String image, User userId, Post repostId,
                      OffsetDateTime createdAt, Long countLikes, Long countRetweets, Long countComments) {
}
