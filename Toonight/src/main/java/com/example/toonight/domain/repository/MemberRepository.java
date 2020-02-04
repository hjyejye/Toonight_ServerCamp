package com.example.toonight.domain.repository;

import com.example.toonight.domain.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

// email을 where 조건절로 하여, 데이터를 가져올 수 있도록 findByEmail()메서드 정의
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    Optional<MemberEntity> findByEmail(String userEmail);
}
