package com.artisan.service;

import java.util.List;

import com.artisan.model.Artisan;

public interface ArtisanService {
	
	List<Artisan> getAllArtisanList();
	
	List<Artisan> getArtisanListByPage(int pageNum , int pageSize);
	
	
}
