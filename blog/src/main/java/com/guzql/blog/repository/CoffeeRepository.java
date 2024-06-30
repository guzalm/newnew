package com.guzql.blog.repository;

import com.guzql.blog.entity.Coffee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeRepository extends CrudRepository<Coffee, Long> {
}
