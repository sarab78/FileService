package com.codeclan.example.FileService.projections;

import com.codeclan.example.FileService.models.File;
import org.springframework.data.rest.core.config.Projection;



@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {

    String getName();
    String getExtension();
    int getSize();

}
