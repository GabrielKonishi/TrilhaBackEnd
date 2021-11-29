package com.trilha.back.end.financys.desafiobackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entry {

    private Long id;
    private String name;
    private String description;
    private String type;
    private String amount;
    private LocalDate date;
    private boolean paid;
    private Category category;

}
