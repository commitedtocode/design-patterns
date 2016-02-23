package impl;

import iface.CloudManager;

import java.util.logging.Logger;

public class OpenstackCloudManager implements CloudManager {

	private Logger LOGGER = Logger.getLogger(OpenstackCloudManager.class.getName());

	public Integer launchComputeInstance(String computeSize) {
		LOGGER.info("Launching Nova Instance of " + computeSize + " size");
		return 123;
	}

	public void storeObject(Object data) {
		LOGGER.info("Putting onject on swift storage " + data.toString());
	}

	public String getComputeStatus(Integer id) {
		LOGGER.info("getting Nova compute status having id: " + id);
		return "RUNNING";
	}

}
