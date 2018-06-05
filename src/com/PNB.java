package com;

interface Bank{
	float rateOfInterest();
}

public class PNB implements Bank{
	
	public float rateOfInterest() {
		return 6.0f;
	}
	
class ICICI implements Bank{
	public float rateOfInterest() {
		return 8.3f;
	}
}	
	
}

