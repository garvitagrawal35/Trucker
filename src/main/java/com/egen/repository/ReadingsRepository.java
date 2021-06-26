package com.egen.repository;

import com.egen.entity.Readings;
import org.springframework.data.repository.CrudRepository;

public interface ReadingsRepository extends CrudRepository<Readings, String> {
}
