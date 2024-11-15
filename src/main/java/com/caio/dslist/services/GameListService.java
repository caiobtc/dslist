package com.caio.dslist.services;

import com.caio.dslist.dto.GameDTO;
import com.caio.dslist.dto.GameListDTO;
import com.caio.dslist.dto.GameMinDTO;
import com.caio.dslist.entities.Game;
import com.caio.dslist.entities.GameList;
import com.caio.dslist.repositories.GameListRepository;
import com.caio.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
