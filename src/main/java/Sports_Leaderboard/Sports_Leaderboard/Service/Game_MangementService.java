package Sports_Leaderboard.Sports_Leaderboard.Service;

import Sports_Leaderboard.Sports_Leaderboard.Models.Game_Mangement;
import Sports_Leaderboard.Sports_Leaderboard.Repositories.Game_MangementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class Game_MangementService {

    @Autowired
    Game_MangementRepository game_MangementRepository;

    public Game_Mangement saveGame(Game_Mangement game) {
        return game_MangementRepository.save(game);
    }

    public void deleteGame(Long gameId) {
        game_MangementRepository.deleteById(id);
    }

    public List<Game_Mangement> getGamesByCreator(String creatorId) {
        return game_MangementRepository.findByCreatorId(creatorId);
    }

    public List<Game_Mangement> getAllGames() {
        return gameRepository.findAll();
    }
}
