package com.usa.palcos.repository.crudrepository;

import com.usa.palcos.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
