package com.kruptokurs.kruptokurs.repo;

import com.kruptokurs.kruptokurs.models.Dogecoin;
import org.springframework.data.repository.CrudRepository;

public interface DogecoinRepository extends CrudRepository<Dogecoin, Integer> {
}
