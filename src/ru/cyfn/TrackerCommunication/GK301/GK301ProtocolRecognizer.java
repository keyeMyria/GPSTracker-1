package ru.cyfn.TrackerCommunication.GK301;

import ru.cyfn.TrackerCommunication.GPSDataPackage;
import ru.cyfn.TrackerCommunication.ProtocolRecognizer;

public class GK301ProtocolRecognizer extends ProtocolRecognizer {

	public GPSDataPackage createDataPackage(byte[] rawData) {
		// TODO Auto-generated method stub
		return null;
	}

	public int testRawBytes(byte[] rawData) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getProtocolName() {
		return "GK301 GPS Kids' Phone Communication Protocol";
		
	}

}
