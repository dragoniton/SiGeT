package com.example.SiGeT.services;

import com.example.SiGeT.dto.TarefaDTO;
import com.example.SiGeT.entity.TarefaEntity;
import com.example.SiGeT.exceptions.AppException;
import com.example.SiGeT.mappers.TarefaMapper;
import com.example.SiGeT.repositories.TarefaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TarefaService {

    private final TarefaRepository tarefaRepository;
    private final TarefaMapper tarefaMapper;

    public List<TarefaDTO> allTarefas(){
        List<TarefaEntity> all = tarefaRepository.findAll();
        return tarefaMapper.toTarefaDtos(all);
    }

    public TarefaDTO getTarefa(Long id){
        TarefaEntity tarefaEntity = tarefaRepository.findById(id)
                .orElseThrow(() -> new AppException("Tarefa não encontrada", HttpStatus.NOT_FOUND));
        return tarefaMapper.toTarefaDto(tarefaEntity);
    }

    public TarefaDTO createTarefa(TarefaDTO tarefaDTO){
        TarefaEntity tarefaEntity = tarefaMapper.toTarefaEntity(tarefaDTO);

        System.out.println("Salvando tarefa: " + tarefaEntity);

        TarefaEntity createdTarefa =  tarefaRepository.save(tarefaEntity);

        System.out.println("Tarefa salva com ID: " + createdTarefa.getId());

        return tarefaMapper.toTarefaDto(createdTarefa);
    }

    public TarefaDTO deleteTarefa(Long id){
        TarefaEntity tarefaEntity = tarefaRepository.findById(id)
                .orElseThrow(() -> new AppException("Tarefa não encontrada", HttpStatus.NOT_FOUND));

        tarefaRepository.deleteById(id);

        return tarefaMapper.toTarefaDto(tarefaEntity);
    }

    public TarefaDTO updateTarefa(Long id, TarefaDTO tarefaDTO){
        TarefaEntity tarefaEntity = tarefaRepository.findById(id)
                .orElseThrow(() -> new AppException("Tarefa não encontrada", HttpStatus.NOT_FOUND));
        tarefaMapper.updateTarefa(tarefaEntity, tarefaMapper.toTarefaEntity(tarefaDTO));

        TarefaEntity updatedTarefa = tarefaRepository.save(tarefaEntity);

        return tarefaMapper.toTarefaDto(updatedTarefa);
    }

}
