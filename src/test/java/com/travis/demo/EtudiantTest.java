package com.travis.demo;

import com.travis.demo.controller.EtudiantController;
import com.travis.demo.model.Etudiant;
import com.travis.demo.repository.EtudiantRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EtudiantTest.class)
public class EtudiantTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private EtudiantRepository repository;

    @Autowired
    private EtudiantController c;

    @Test
    public void testWelcome() throws Exception {
        Etudiant e = new Etudiant();
        e.setUsername("xin");
        e.setPwd("123");
        c.create(e);
    }
}
