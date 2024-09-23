package com.example.SiGeT.controller;

import com.example.SiGeT.dto.TarefaDTO;
import com.example.SiGeT.services.TarefaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class TarefaController {

    private final TarefaService tarefaService;

    @GetMapping("/tarefas")
    public ResponseEntity<List<TarefaDTO>> allTarefas(){
        return ResponseEntity.ok(tarefaService.allTarefas());
    }


    @GetMapping("/tarefas/{id}")
    public ResponseEntity<TarefaDTO> getTarefa(@PathVariable Long id) {
        return ResponseEntity.ok(tarefaService.getTarefa(id));
    }

    @PostMapping("/tarefas")
    public ResponseEntity<TarefaDTO> createTarefa(@RequestBody TarefaDTO tarefaDTO){
        TarefaDTO createdTarefa = tarefaService.createTarefa(tarefaDTO);
        return ResponseEntity.created(URI.create("/tarefas/" + createdTarefa.getId())).body(createdTarefa);
    }

    @DeleteMapping("/tarefas/{id}")
    public ResponseEntity<TarefaDTO> deleteTarefa(@PathVariable Long id){
        return ResponseEntity.ok(tarefaService.deleteTarefa(id));
    }

    @PutMapping("/tarefas/{id}")
    public ResponseEntity<TarefaDTO> updateTarefa(@PathVariable Long id, @Valid @RequestBody TarefaDTO tarefaDTO){
        return ResponseEntity.ok(tarefaService.updateTarefa(id, tarefaDTO));
    }
}
