package com.demo.loginandregistration.appuser;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface AppUserRepository {
	Optional<AppUser> findByEmail(String email);
}
