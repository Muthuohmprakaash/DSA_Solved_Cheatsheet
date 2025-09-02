package com.seleniumExpress.sortingPlayList;

public class Song implements Comparable<Song> {
	private Integer playList;
	private String singer;
	private String singerName;

	public Song(Integer p, String s, String sn) {
		this.playList = p;
		this.singer = s;
		this.singerName = sn;
	}

	public Integer getPlayList() {
		
		return playList;
	}

	public void setPlayList(Integer p) {

		this.playList = p;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	@Override
	public String toString() {
		return playList +"->  "+ singer + "->  "+ singerName;
	}
	
	@Override
	public int compareTo(Song o) {
		
		return -this.getPlayList().compareTo(o.playList);
	}

	

}
