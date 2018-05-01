package com.streams.filter;

import java.util.ArrayList;

import com.beans.Artist;
import com.data.GenerateData;

public class StreamsFiltering {

	public static void main(String args[]) {
		GenerateData genData = new GenerateData();
		ArrayList<Artist> artists = genData.getArtistList();
		
		long count = artistCountFromOrigin(artists, "USA");
		System.out.println("Count of Artists from USA is : "+ count);
	}
	
	// Returning number of artist from given origin
	public static long artistCountFromOrigin(ArrayList<Artist> artists,String origin) {
		long count = artists.stream().filter(artist -> artist.getOrigin().equalsIgnoreCase(origin)).count();
		return count;
	}
}
