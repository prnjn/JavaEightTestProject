package com.streams.filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.beans.Artist;
import com.data.GenerateData;

public class StreamsFiltering {

	public static void main(String args[]) {
		GenerateData genData = new GenerateData();
		ArrayList<Artist> artists = genData.getArtistList();
		
		// use for collecting
		//.collect(Collectors.toList()
		
		long countBand = bandCountFromOrigin(artists, "USA");
		System.out.println("Number of bands from USA is : "+ countBand);
		
		long countArtist;
		
		countArtist = artistCountFromOrigin(artists, "USA");
		System.out.println("Total numbers of artist from USA including all Bands is : "+countArtist);
		
		countArtist= artistCountFromOrigin(artists, "Russia");
		System.out.println("Total numbers of artist from Russia including all Bands is : "+countArtist);
		

	}
	
	// Returning number of bands from given origin
	public static long bandCountFromOrigin(ArrayList<Artist> artists,String origin) {
		long countBand = artists.stream()
							    .filter(artist -> artist.getOrigin().equalsIgnoreCase(origin))
							    .count();
		return countBand;
	}
	
	// Returning number of member artists from given origin including all bands
	public static int artistCountFromOrigin(ArrayList<Artist> artists,String origin) {
		
		int countArtist = (int) artists.stream()
				                       .filter(artist -> artist.getOrigin().equalsIgnoreCase(origin))
			                           .flatMap(artist -> artist.getMembers().stream()).count();

		return countArtist;
	}
	
	//Returns individual artists mapped to Origin from all bands
	public Map<String,List<String>> artistsFromOrigin(ArrayList<Artist> artists,String origin){
		Map<String,List<String>> artistLocationMap = new HashMap<String,List<String>>();
		
		 // to be implemented
		
		return artistLocationMap;
	}
	
}
