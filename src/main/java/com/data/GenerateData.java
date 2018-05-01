package com.data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import com.beans.Artist;

public class GenerateData {

	//Returns List of Artist objects
	public ArrayList<Artist> getArtistList() {
		ArrayList<Artist> artists = new ArrayList<Artist>();
		
		Artist artist1 = new Artist();
		Artist artist2 = new Artist();
		Artist artist3 = new Artist();
		Artist artist4 = new Artist();
		Artist artist5 = new Artist();
		Artist artist6 = new Artist();
		
		artist1.setName("The Beatels");
		artist1.setOrigin("Australia");
		artist1.setMembers(new ArrayList<String>(Arrays.asList("Daniel","Robert","Skimmer","Raggae")));
		
		artist2.setName("Richard");
		artist2.setOrigin("UK");
		artist2.setMembers(new ArrayList<String>(Arrays.asList("Richard")));
		
		artist3.setName("The Skull Candy");
		artist3.setOrigin("USA");
		artist3.setMembers(new ArrayList<String>(Arrays.asList("Smith","Leech","Robert","Angelica","Ryan","Stone Cold","Ricky","Adam","Nina")));
		
		artist4.setName("The Music Sharks");
		artist4.setOrigin("Australia");
		artist4.setMembers(new ArrayList<String>(Arrays.asList("Vladimir","Kovensky","Damitri","Vasilli")));
		
		artist5.setName("The Band of Boys");
		artist5.setOrigin("USA");
		artist5.setMembers(new ArrayList<String>(Arrays.asList("Terry","Rubbel")));
		
		artist6.setName("Arijeet Singh");
		artist6.setOrigin("India");
		artist6.setMembers(new ArrayList<String>(Arrays.asList("Arijeet Singh")));
		
		return artists;
	}
}
