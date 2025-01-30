package com.example.demo.repository;

import com.example.demo.entity.Shift;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftRepository extends JpaRepository<Shift, Long> {
    // 추가적인 쿼리 메서드가 필요하면 여기서 정의할 수 있습니다.
}