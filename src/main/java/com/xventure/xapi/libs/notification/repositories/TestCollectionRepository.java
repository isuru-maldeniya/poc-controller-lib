package com.xventure.xapi.libs.notification.repositories;
import com.xventure.xapi.libs.mongosearch.XAPIMongoDBRepository;
import com.xventure.xapi.libs.notification.model.TestCollection;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Documented;

@Repository
@Component
public interface TestCollectionRepository extends XAPIMongoDBRepository<TestCollection, String>{
}
