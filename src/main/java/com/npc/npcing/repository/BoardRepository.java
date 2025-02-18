package com.npc.npcing.repository;

import com.npc.npcing.entity.board.BoardEntity;
import com.npc.npcing.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    List<BoardEntity> findByUser(UserEntity userEntity);
}
