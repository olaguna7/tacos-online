package com.oscar.tacosonline.data;

import com.oscar.tacosonline.model.Taco;
import jakarta.validation.Valid;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
    Taco deleteTacoById(Long id);

    Taco save(@Valid Taco design);

    Optional<Taco> findById(Long id);

    void deleteById(Long id);

    Iterable<Taco> findAll();
}
