package impl;

import iface.CloudManager;
import iface.CloudFactory;

public class PublicCloudFactory implements CloudFactory {

	public static final String AWS_CLOUD = "AWS_CLOUD";
	public static final String GOOGLE_CLOUD = "GOOGLE_CLOUD";
	private static volatile PublicCloudFactory cloudFactory;
	
	public static PublicCloudFactory getInstance() {
		if(cloudFactory == null) {
			synchronized (PrivateCloudFactory.class) {
				cloudFactory = cloudFactory == null ? new PublicCloudFactory() : cloudFactory;
			}
		}
		
		return cloudFactory;
	}

	public CloudManager getCloud(String cloudType) {

		if (AWS_CLOUD.equalsIgnoreCase(cloudType)) {
			return new AWSCloudManager();
		} else if (GOOGLE_CLOUD.equalsIgnoreCase(cloudType)) {
			return new GoogleCloudManager();
		} else {
			return null;
		}
	}

}
