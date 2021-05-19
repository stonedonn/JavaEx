package com.javaex.oop.practice3.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel) {
		this.channel = channel;
	}
	
	public TV(int channel, int volume, boolean power) {
		this(channel);
		this.volume = volume;
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean getPower() {
		return power;
	}
	
}
