package com.api.genshinimpact.dto;

import com.api.genshinimpact.entities.Image;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

public class ImageDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Lob
    private Blob image;
    private Date date = new Date();

    public ImageDTO(){};

    public ImageDTO(Image imageOBJ){
        this.id = imageOBJ.getId();
        this.image = imageOBJ.getImage();
        this.date = imageOBJ.getDate();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
