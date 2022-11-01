package com.location_web_app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.location_web_app.entity.location;

public interface LocationRepository extends CrudRepository<location, Long> {

}
