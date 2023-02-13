package com.springKafka.sprinKafka.repository;


import com.springKafka.sprinKafka.module.MentorModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MentorRepository extends MongoRepository<MentorModel,String> {


}
