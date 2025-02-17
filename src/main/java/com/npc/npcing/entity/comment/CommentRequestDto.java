package com.npc.npcing.entity.comment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentRequestDto {
    private Long boardId;
    private String content;
    private String writer;
}