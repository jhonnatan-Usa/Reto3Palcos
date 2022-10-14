package com.usa.palcos.repository.crudrepository;

import com.usa.palcos.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
}
