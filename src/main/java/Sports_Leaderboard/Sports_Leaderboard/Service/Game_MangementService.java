package Sports_Leaderboard.Sports_Leaderboard.Service;

import Sports_Leaderboard.Sports_Leaderboard.Repositories.Game_MangementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Game_MangementService {

    @Autowired
    Game_MangementRepository game_MangementRepository;

    public Game saveGame(Game game) {
        return gameRepository.save(game);
    }

    public void deleteGame(Long gameId) {
        gameRepository.deleteById(gameId);
    }

    public List<Game> getGamesByCreator(String creatorId) {
        return gameRepository.findByCreatorId(creatorId);
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }
}
