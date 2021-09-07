package com.dio.controlepontoacesso.controller;


import com.dio.controlepontoacesso.model.JornadaTrabalho;
import com.dio.controlepontoacesso.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController //Faz os métodos retornarem um JSON
@RequestMapping("/jornada")
public class JornadaTrabalhoCotroller {
    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        return  ResponseEntity.ok(jornadaService.getById(idJornada)
                .orElseThrow(() -> new NoSuchElementException("Dado não encontrado!!!")));
    }


    @PutMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> updateJornada
            (@PathVariable("idJornada") Long idJornada, @Valid @RequestBody JornadaTrabalho jornadaDetalhes)
            throws Exception {
                JornadaTrabalho jornada = jornadaService.getById(idJornada)
                        .orElseThrow(() -> new NoSuchElementException("Dado não encontrado!!!"));
                        jornada.setDescricao(jornadaDetalhes.getDescricao());

        final JornadaTrabalho jornadaModificada = jornadaService.updateJornada(jornada);
        return ResponseEntity.ok(jornadaModificada);
    }


    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            jornadaService.deleteJornada(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.noContent().build();
    }


}
