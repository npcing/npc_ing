//package com.npc.npcing.controller;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import com.npc.npcing.global.exception.CustomException;
//import com.npc.npcing.entity.Dto.ErrorResponseDto;
//
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
//     // 📌 커스텀 예외 처리
//     @ExceptionHandler(CustomException.class)
//     public ResponseEntity<ErrorResponseDto> handleCustomException(CustomException ex) {
//         return ResponseEntity
//                 .status(ex.getErrorCode().getStatus())
//                 .body(new ErrorResponseDto(ex.getErrorCode()));
//     }
//}
