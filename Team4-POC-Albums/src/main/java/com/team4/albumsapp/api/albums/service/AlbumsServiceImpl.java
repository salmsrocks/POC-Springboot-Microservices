/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team4.albumsapp.api.albums.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.team4.albumsapp.api.albums.data.AlbumsEntity;

@Service
public class AlbumsServiceImpl implements AlbumsService {

    @Override
    public List<AlbumsEntity> getAlbums(String userId) {
        List<AlbumsEntity> returnValue = new ArrayList<>();
        
        AlbumsEntity albumEntity = new AlbumsEntity();
        albumEntity.setUserId(userId);
        albumEntity.setAlbumId("album1Id");
        albumEntity.setDescription("album 1 description");
        albumEntity.setId(1L);
        albumEntity.setName("album 1 name");
        
        AlbumsEntity albumEntity2 = new AlbumsEntity();
        albumEntity2.setUserId(userId);
        albumEntity2.setAlbumId("album2Id");
        albumEntity2.setDescription("album 2 description");
        albumEntity2.setId(2L);
        albumEntity2.setName("album 2 name");
        
        returnValue.add(albumEntity);
        returnValue.add(albumEntity2);
        
        return returnValue;
    }
    
}
