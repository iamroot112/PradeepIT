package in.pradeep.repository;

import org.springframework.data.repository.CrudRepository;

import in.pradeep.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
