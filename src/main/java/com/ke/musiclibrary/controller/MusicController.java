package com.ke.musiclibrary.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ke.musiclibrary.model.MusicModel;



@RestController
@RequestMapping(value = "/music")
public class MusicController {
	
	
	
	@GetMapping(value = "/list")
	public List<MusicModel> getMusicLibrary(){
		
		List<MusicModel> musicLibrary = new ArrayList<>();
		
		MusicModel music = new MusicModel();
		music.setComposer("Tasos Xalkias");
		music.setTitle("MinoreTouTeke");
		
		System.out.print(music);
		
		musicLibrary.add(music);
		
		
		return musicLibrary;
	
	}
	
	@PostMapping(value = "/newTrack")
	public HttpStatus postMusicModel(@RequestBody MusicModel newTrack) {
			
			//MusicModel newTrack = new MusicModel();
			newTrack.getComposer();
			newTrack.getTitle();
			
			List<MusicModel> musicLibrary = new ArrayList<>();
			musicLibrary.add(newTrack);
			
			System.out.println(musicLibrary);
			
			
			return HttpStatus.OK;
		
	}
	
}
