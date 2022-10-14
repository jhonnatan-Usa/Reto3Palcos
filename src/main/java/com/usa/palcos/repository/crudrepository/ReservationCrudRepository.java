package com.usa.palcos.repository.crudrepository;

import com.usa.palcos.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
