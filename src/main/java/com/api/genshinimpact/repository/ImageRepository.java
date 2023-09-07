package com.api.genshinimpact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.genshinimpact.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
