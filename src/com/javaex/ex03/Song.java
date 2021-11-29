//Undone//2021.11.30(화)07:31
/*
[문제] com.javaex.ex03 패키지
아래의 출력결과를 예상하여 작성하세요. (코드를 작성해서 예상과 맞는지 확인해 보세요.)
*/
//결과: 아무 것도 출력이 안 됨. main()에 출력을 쓰자. 일요일에 질문 드렸음에도 아직 main()과 비main()에 있을 내용 구분이 정확히 안 된다
//육안으로는 gs 붙이든 안 붙이든 동일하게 출력

package com.javaex.ex03;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	//생성자
	public Song() {
		System.out.println();
	}
		
	public Song(String title, String artist, String album, String composer, String year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println();
	}
	
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title, artist, album, composer, year);
		this.track = track;
		System.out.println();
	}
	
	//메소드 gs
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	//메소드 일반
	public void showInfo() {
		System.out.println(title +", " + artist + ", " + album +", "+ composer +", " + year +", " + track);
	}
}



