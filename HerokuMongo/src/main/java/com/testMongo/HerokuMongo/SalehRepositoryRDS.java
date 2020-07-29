package com.testMongo.HerokuMongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalehRepositoryRDS extends MongoRepository<Saleh, String> {
}
