package com.babel.models;

import lombok.Data;

/**
 * Created by jundisassaki on 11/8/14.
 */

@Data
public class News {

    private String url;
    private String type;
    private String title;
    private String text;
    private String photoUrl;
    private boolean readLater;
    private boolean favorite;
    private String[] photoAlbum;

}
