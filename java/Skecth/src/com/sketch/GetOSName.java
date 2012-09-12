package com.sketch;

public class GetOSName {
	public GetOSName() {
		String osName= System.getProperty("os.name");
		System.out.println("Operating system name =>"+ osName);
	}
}
