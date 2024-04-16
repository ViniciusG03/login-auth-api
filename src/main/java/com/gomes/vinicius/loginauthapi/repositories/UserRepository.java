package com.gomes.vinicius.loginauthapi.repositories;

import com.gomes.vinicius.loginauthapi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {


}
