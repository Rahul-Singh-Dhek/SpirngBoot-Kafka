package com.springKafka.sprinKafka.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "CSVDoc")
public class MentorModel {
    private Double AbsentHours;
    private String JobTitle;
    private Integer EmployeeNumber;
    private String Division;
    private String StoreLocation;
    private String DepartmentName;
    private String BusinessUnit;
    private Double Age;
    private String GivenName;
    private String City;
    private String Surname;
    private Integer Gender;
    private Double LengthService;

//    "AbsentHours","JobTitle","EmployeeNumber","Division","StoreLocation","DepartmentName","BusinessUnit","Age",
//    "GivenName","City","Surname","Gender","LengthService"

}

