package fr.helenou.forumSpringMVC.repositories;

import org.springframework.data.jpa.repository.Jp
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import fr.helenou.forumSpringMVC.beans.User;

@EnableJpaRepositories
public class UserRepository implements JpaRepository<User, Long> {

}
