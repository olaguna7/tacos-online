package com.oscar.tacosonline.data;

import org.springframework.data.repository.CrudRepository;
import com.oscar.tacosonline.model.Usuario;

public interface UserRepository extends CrudRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
