package com.workintech.spring17challenge.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Grade {
    private Integer coefficient;
    private String note;

}