package com.npc.npcing.repository;

import com.npc.npcing.entity.board.BoardEntity;
import com.npc.npcing.entity.comment.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    List<CommentEntity> findByBoard(BoardEntity boardEntity);
}
