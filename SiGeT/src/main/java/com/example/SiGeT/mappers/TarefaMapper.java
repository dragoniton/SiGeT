package com.example.SiGeT.mappers;
import com.example.SiGeT.dto.TarefaDTO;
import com.example.SiGeT.entity.TarefaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefaMapper {

    TarefaEntity toTarefaEntity(TarefaDTO tarefaDTO);

    TarefaDTO toTarefaDto(TarefaEntity tarefaEntity);

    List<TarefaDTO> toTarefaDtos(List<TarefaEntity> tarefas);

    void updateTarefa(@MappingTarget TarefaEntity target, TarefaEntity source);
}
