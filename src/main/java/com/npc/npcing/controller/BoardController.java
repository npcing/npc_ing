package com.npc.npcing.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final PostService postService;

    // 게시글 생성
    @PostMapping
    public ResponseEntity<BoardRequestDto> createPost(@RequestBody BoardRequestDto boardRequestDto) {
        return ResponseEntity.ok(postService.createPost(BoardRequestDto));
    }

    // 모든 게시글 조회
    @GetMapping
    public ResponseEntity<List<BoardRequestDto>> getAllPosts() {
        return ResponseEntity.ok(postService.getAllPosts());
    }

    // 특정 게시글 조회
    @GetMapping("/{id}")
    public ResponseEntity<BoardRequestDto> getPostById(@PathVariable Long id) {
        return ResponseEntity.ok(postService.getPostById(id));
    }

    // 게시글 수정
    @PutMapping("/{id}")
    public ResponseEntity<BoardRequestDto> updatePost(@PathVariable Long id, @RequestBody BoardRequestDto boardRequestDto) {
        return ResponseEntity.ok(postService.updatePost(id, boardRequestDto));
    }

    // 게시글 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
        postService.deletePost(id);
        return ResponseEntity.noContent().build();
    }
}