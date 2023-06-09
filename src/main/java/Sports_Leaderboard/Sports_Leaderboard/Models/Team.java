package Sports_Leaderboard.Sports_Leaderboard.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;

@Data
@Getter
@Setter
@Entity
@Table(name = "Team")
public class Team extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    Integer teamId;
    Integer wins;
    Integer losses;
    @OneToOne
    @JoinColumn(name = "registerId", referencedColumnName = "id") // FK
    Registration registration;
}
