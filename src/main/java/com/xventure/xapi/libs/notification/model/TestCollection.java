package com.xventure.xapi.libs.notification.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestCollection {
    @Id
    private ObjectId id;
    private String name;
    private String address;

    public TestCollection(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
