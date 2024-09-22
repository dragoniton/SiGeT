package com.example.SiGeT.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
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
}
