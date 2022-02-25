package com.exercise.ej2;

import java.util.Date;

public record PersonaInputDTO(
        Integer id,
        String usuario,
        String password,
        String name,
        String surname,
        String company_email,
        String personal_email,
        String city,
        boolean active,
        Date created_date,
        String imagen_url,
        Date termination_date
        ){}

/*
@Data
public class PersonaInputDTO {
    private Integer id;
    String usuario;
    String password;
    String name;
    String surname;
    String company_email;
    String personal_email;
    String city;
    boolean active;
    Date created_date;
    String imagen_url;
    Date termination_date;
}*/
