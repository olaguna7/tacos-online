package com.oscar.tacosonline.data;

import com.oscar.tacosonline.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
