package com.npc.npcing.global.util;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    
    // 📌 게시글 관련 예외
    POST_NOT_FOUND("게시글을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    POST_ALREADY_DELETED("이미 삭제된 게시글입니다.", HttpStatus.BAD_REQUEST),

    // 📌 사용자 관련 예외
    USER_NOT_FOUND("사용자를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    DUPLICATE_USERNAME("이미 사용 중인 사용자 이름입니다.", HttpStatus.CONFLICT),

    // 📌 댓글 관련 예외
    COMMENT_NOT_FOUND("댓글을 찾을 수 없습니다.", HttpStatus.NOT_FOUND);

    private final String message;
    private final HttpStatus status;

    ErrorCode(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }
}
