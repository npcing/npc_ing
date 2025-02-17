package com.npc.npcing.entity.Dto;

import lombok.Getter;
import com.npc.npcing.global.util.ErrorCode;

import java.time.LocalDateTime;

@Getter
public class ErrorResponseDto {
    private final String message;
    private final int status;
    private final LocalDateTime timestamp;

    public ErrorResponseDto(ErrorCode errorCode) {
        this.message = errorCode.getMessage();
        this.status = errorCode.getStatus().value();
        this.timestamp = LocalDateTime.now();
    }
}
