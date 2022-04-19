package com.xventure.xapi.libs.notification.service;

import com.xventure.xapi.libs.notification.model.TestCollection;
import com.xventure.xapi.libs.notification.repositories.TestCollectionRepository;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestCollectionRepository repository;

    public void saveTestCollection(String name){
        repository.save(new TestCollection(name, "Lathpandura"));
    }
}
