package com.example.funcionarios.web;

import com.example.funcionarios.domain.Funcionario;
import com.example.funcionarios.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/funcionarios")
@CrossOrigin
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping("")
    public ResponseEntity<?> adicionaFuncionarioNaLista(@RequestBody Funcionario funcionario){
        Funcionario novoFuncionario = funcionarioService.salvarFuncionario(funcionario);
        return new ResponseEntity<Funcionario>(novoFuncionario, HttpStatus.CREATED);
    }

    @GetMapping("/todos")
    public Iterable<Funcionario> retornaTodosFuncionarios(){
        return funcionarioService.retornarTodosFuncionarios();
    }
}
