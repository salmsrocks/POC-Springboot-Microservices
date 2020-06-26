/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team4.albumsapp.api.albums.service;


import java.util.List;

import com.team4.albumsapp.api.albums.data.AlbumsEntity;

public interface AlbumsService {
    List<AlbumsEntity> getAlbums(String userId);
}
