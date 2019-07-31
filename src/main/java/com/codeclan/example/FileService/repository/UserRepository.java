package com.codeclan.example.FileService.repository;

import com.codeclan.example.FileService.models.User;
import com.codeclan.example.FileService.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
