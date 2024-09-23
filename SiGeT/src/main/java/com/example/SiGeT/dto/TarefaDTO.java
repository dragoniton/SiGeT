package com.example.SiGeT.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class TarefaDTO {

    private Long id;

    @NotBlank
    private String title;
    private String description;

    @NotBlank
    private String owner;

    @NotBlank
    private String priority;

    @NotBlank
    private String deadline;

    @NotBlank
    private Boolean done;

}
