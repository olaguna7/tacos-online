package com.oscar.tacosonline.data;

import com.oscar.tacosonline.model.Taco;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
    Taco deleteTacoById(Long id);
}
