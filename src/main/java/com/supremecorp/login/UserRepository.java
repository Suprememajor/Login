package com.supremecorp.login;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by suprememajor on 9/29/21
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
