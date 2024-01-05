package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.Comment;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
 @Query(value = "select * from comments where ad_id = :ad_id", nativeQuery = true)

    List<Comment> findByAd_Pk(@Param("ad_id") Integer adId);

    Optional<Comment> findByIdAndAd_Pk (Integer id, Integer adId);

   }
