package com.example.boardJPA.repository;

import com.example.boardJPA.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    @Modifying
    @Query(value = "UPDATE BoardEntity b SET b.boardHits = b.boardHits + 1 where b.id = :id")
    void updateHits(@Param("id") Long id);

}
