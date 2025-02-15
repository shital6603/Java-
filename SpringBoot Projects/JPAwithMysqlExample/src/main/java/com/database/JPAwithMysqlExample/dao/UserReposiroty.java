package com.database.JPAwithMysqlExample.dao;

import com.database.JPAwithMysqlExample.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserReposiroty extends CrudRepository<User, Integer> {

}
