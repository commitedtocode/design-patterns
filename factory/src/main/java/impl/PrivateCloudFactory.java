package impl;

import iface.CloudManager;
import iface.CloudFactory;

public class PrivateCloudFactory implements CloudFactory {

	public static final String OPENSTACK_CLOUD = "OPENSTACK_CLOUD";
	public static final String CLOUDSTACK_CLOUD = "CLOUDSTACK_CLOUD";
	private static volatile  PrivateCloudFactory cloudFactory;
	
	private PrivateCloudFactory() {
		
	}
	
	public static CloudFactory getInstance() {
		if(cloudFactory == null) {
			synchronized (PrivateCloudFactory.class) {
				cloudFactory = cloudFactory == null ? new PrivateCloudFactory() : cloudFactory;
			}
		}
		
		return cloudFactory;
	}

	public CloudManager getCloud(String cloudType) {

		if (OPENSTACK_CLOUD.equalsIgnoreCase(cloudType)) {
			return new OpenstackCloudManager();
		} else if(CLOUDSTACK_CLOUD.equalsIgnoreCase(cloudType)) {
			return new CloudstackCloudManager();
		} else {
			return null;
		}
	}

}
