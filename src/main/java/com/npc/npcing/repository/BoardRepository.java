package com.npc.npcing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.npc.npcing.entity.BoardEntity;  
import com.npc.npcing.entity.UserEntity;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    List<BoardEntity> findByUser(UserEntity userEntity);
}
