package org.badgrades;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by ldowell on 6/2/16.
 */
@Repository
@RestResource(path = "teams", rel = "team")
public interface TeamRepository extends CrudRepository<Team, Long> {
}
