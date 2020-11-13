package com.er.cbfapi.controllers;

import com.er.cbfapi.model.Jogador;
import com.er.cbfapi.model.dto.JogadorDto;
import com.er.cbfapi.repository.JogadorRepository;
import com.er.cbfapi.services.JogadorService;
import com.er.cbfapi.util.JogadorUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class JogadorControllerTest {

    private final Long ID = 1L;
    private final String NOME = "Eduardo";
    private final LocalDate DATA_NASCIMENTO = LocalDate.of(2000, 07, 07);
    private final String URL = "/jogador";

    private Jogador jogador2;

    @Autowired
    JogadorService jogadorService;

    @Autowired
    JogadorRepository jogadorRepository;

    @Autowired
    MockMvc mvc;

    @BeforeEach
    void setUp() {
        Jogador jogador = new Jogador();
        jogador.setId(ID);
        jogador.setNome(NOME);
        jogador.setDataNascimento(DATA_NASCIMENTO);

        jogador2 = jogadorService.save(jogador);
    }

    @AfterEach
    void tearDown() {
        jogadorRepository.deleteAll();
    }

    @Test
    void testCadastrarJogadorValido() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post(URL).content(getJsonPayload(NOME, DATA_NASCIMENTO))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }

    String getJsonPayload(String nome, LocalDate dataNascimento) throws JsonProcessingException {
        Jogador jogador = new Jogador();
        jogador.setNome(nome);
        jogador.setDataNascimento(dataNascimento);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        return objectMapper.writeValueAsString(jogador);
    }
}
