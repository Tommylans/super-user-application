package com.vnetpublishing.java.suapp;

public interface ISudo {
	public int sudo();
	public int sudo(String[] args);
	public int sudo(String[] args, String[] additionalArgs);
}
