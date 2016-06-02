package org.badgrades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ldowell on 6/2/16.
 */
//@RestController Controlled by DATA-REST in TeamRepository
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @RequestMapping("/teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }

    @RequestMapping("/team/{id}")
    public Team getTeam(@PathVariable long id) {
        return teamRepository.findOne(id);
    }
}
