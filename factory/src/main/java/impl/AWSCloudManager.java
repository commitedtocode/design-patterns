package impl;

import iface.CloudManager;

import java.util.logging.Logger;

public class AWSCloudManager implements CloudManager {
	
	private Logger LOGGER = Logger.getLogger(AWSCloudManager.class.getName());

	public Integer launchComputeInstance(String computeSize) {
		LOGGER.info("Launching EC2 Instance of " + computeSize + " size" );
		return 123;
	}

	public void storeObject(Object data) {
		LOGGER.info("Putting onject on S3 " + data.toString());
	}

	public String getComputeStatus(Integer id) {
		LOGGER.info("getting EC2 status having id: " + id);
		return "RUNNING";
	}

}
