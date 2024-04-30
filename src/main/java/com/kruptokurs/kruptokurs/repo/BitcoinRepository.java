package com.kruptokurs.kruptokurs.repo;

import com.kruptokurs.kruptokurs.models.Bitcoin;
import org.springframework.data.repository.CrudRepository;

public interface BitcoinRepository extends CrudRepository<Bitcoin, Integer> {
}
