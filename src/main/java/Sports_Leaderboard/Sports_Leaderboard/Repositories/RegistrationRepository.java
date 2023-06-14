package Sports_Leaderboard.Sports_Leaderboard.Repositories;

import Sports_Leaderboard.Sports_Leaderboard.Models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
}
