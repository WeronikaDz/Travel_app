package com.travel_app.repository;

import com.travel_app.entity.ApplicationUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationUserRepository extends JpaRepository<ApplicationUserEntity, Long> {

}