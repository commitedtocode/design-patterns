package impl;

import java.util.logging.Logger;

import iface.CloudManager;

public class CloudstackCloudManager implements CloudManager {

	private Logger LOGGER = Logger.getLogger(CloudstackCloudManager.class.getName());

	public Integer launchComputeInstance(String computeSize) {
		LOGGER.info("Launching cloustack compute Instance of " + computeSize
				+ " size");
		return 123;
	}

	public void storeObject(Object data) {
		LOGGER.info("Putting onject on cloud storage " + data.toString());
	}

	public String getComputeStatus(Integer id) {
		LOGGER.info("getting cloudstack compute status having id: " + id);
		return "RUNNING";
	}

}
