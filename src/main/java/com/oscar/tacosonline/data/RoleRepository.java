package com.oscar.tacosonline.data;

import org.springframework.data.repository.CrudRepository;
import com.oscar.tacosonline.model.Roles;

public interface RoleRepository extends CrudRepository<Roles, Long> {
}
