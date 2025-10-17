package com.sjar.transportapi.domain.model;

import java.time.LocalDateTime;
import java.util.Date;

public class User {
    private int id;
    private String name;
    private String lastName;
    private Date birthday;
    private String email;
    private String password_hash;
    private int department_id;
    private Boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int createdBy;
    private int updatedBy;
}
