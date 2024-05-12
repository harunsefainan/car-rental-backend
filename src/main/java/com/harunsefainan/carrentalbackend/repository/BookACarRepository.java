package com.harunsefainan.carrentalbackend.repository;

import com.harunsefainan.carrentalbackend.dto.BookACarDto;
import com.harunsefainan.carrentalbackend.entity.BookACar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookACarRepository extends JpaRepository<BookACar, Long> {
    List<BookACar> findAllByUserId(Long userId);
}
