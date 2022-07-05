package com.ninos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Appointment {
    private Long id;
    private Date date;
    private String location;
    private String description;
    private boolean confirmed;

    private User user;





}
