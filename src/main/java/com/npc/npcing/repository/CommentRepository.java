package com.npc.npcing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.npc.npcing.entity.BoardEntity;
import com.npc.npcing.entity.CommentEntity;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    List<CommentEntity> findByBoard(BoardEntity boardEntity);
}
