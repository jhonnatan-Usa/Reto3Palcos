package com.usa.palcos.repository;

import com.usa.palcos.model.Message;
import com.usa.palcos.repository.crudrepository.MessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> getAll(){
        return  (List<Message>) messageCrudRepository.findAll();
    }

    public Optional<Message> getById (Integer id){
        return messageCrudRepository.findById(id);
    }

    public Message save (Message message){
        return messageCrudRepository.save(message);
    }

    public void delete (Message message){
        messageCrudRepository.delete(message);
    }
}
