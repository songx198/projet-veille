package com.travis.demo.controller;

import com.travis.demo.model.Etudiant;
import com.travis.demo.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping("/etudiants")
public class EtudiantController {

    @Autowired
    private EtudiantRepository repository;

    @GetMapping("/hello")
    public String welcome() {
        return "Welcome";
    }

    @GetMapping
    public List<Etudiant> getAllStudents() {
        return repository.findAll();
    }

    @PostMapping
    public Etudiant create(@RequestBody Etudiant newEtudiant) {
        List<Etudiant> listStudent = repository.findAll();
        return repository.saveAndFlush(newEtudiant);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable long id) {
        repository.deleteById(id);
    }
}
