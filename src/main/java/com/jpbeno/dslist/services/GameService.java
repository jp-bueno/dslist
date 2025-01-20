package com.jpbeno.dslist.services;

import com.jpbeno.dslist.dto.GameMinDTO;
import com.jpbeno.dslist.entities.Game;
import com.jpbeno.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> lsGameResult = gameRepository.findAll();

        List<GameMinDTO> dto = lsGameResult.stream().map(GameMinDTO::new).toList();

        return dto;
    }
}
