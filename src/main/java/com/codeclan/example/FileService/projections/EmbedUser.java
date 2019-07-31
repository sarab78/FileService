package com.codeclan.example.FileService.projections;

import com.codeclan.example.FileService.models.Folder;
import com.codeclan.example.FileService.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {

    Long getId();
    String getTitle();
    User getUser();
}
