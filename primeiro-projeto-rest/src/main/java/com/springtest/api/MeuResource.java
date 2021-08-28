package com.springtest.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class MeuResource {

    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> exlcuir(){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        return new ResponseEntity<>(cliente, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public Cliente obterDadosCliente(@PathVariable Long id){
        return new Cliente("Solu", "503.369.128-70");
    }
}
