package Sports_Leaderboard.Sports_Leaderboard.Repositories;

import Sports_Leaderboard.Sports_Leaderboard.Models.Game_Mangement;
import Sports_Leaderboard.Sports_Leaderboard.Models.Player;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.List;

@Repository
public interface Game_MangementRepository extends JpaRepository<Game_Mangement, Integer> {
    void deleteById(SingularAttribute<AbstractPersistable, Serializable> id);

    List<Game_Mangement> findGameById(SingularAttribute<AbstractPersistable, Serializable> id);
}
