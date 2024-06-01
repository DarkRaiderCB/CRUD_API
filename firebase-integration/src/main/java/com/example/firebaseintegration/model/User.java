package com.example.firebaseintegration.model;

import lombok.Data;
import java.util.Map;

@Data
public class User {
    private String id;
    private String name;
    private Map<String, Integer> subjectMarks;
}

