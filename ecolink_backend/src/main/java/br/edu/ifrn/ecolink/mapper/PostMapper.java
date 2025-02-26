package br.edu.ifrn.ecolink.mapper;

import br.edu.ifrn.ecolink.dto.PostDTO;
import br.edu.ifrn.ecolink.model.Post;
import br.edu.ifrn.ecolink.service.CommentService;
import br.edu.ifrn.ecolink.service.PostLikeService;
import br.edu.ifrn.ecolink.service.PostService;
import br.edu.ifrn.ecolink.service.RepostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PostMapper {
    private final PostLikeService postLikeService;
    private final RepostService repostService;
    private final CommentService commentService;
    private final PostService postService;

    public PostDTO toDTO(Post post) {
        return new PostDTO(post.getId(),
                post.getText(),
                post.getVideo(),
                post.getImage(),
                post.getUser(),
                post.getRepostId(),
                post.getCreatedAt(),
                postLikeService.countByPost(post),
                repostService.countByPost(post),
                commentService.countByPost(post));
    }

    public Optional<Post> toPost(PostDTO postDTO) {
        return postService.findById(postDTO.id());
    }

}

