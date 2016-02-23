import java.util.logging.Logger;

import iface.CloudManager;
import iface.CloudFactory;
import impl.PrivateCloudFactory;


public class Client {
	
	private static Logger LOGGER = Logger.getLogger(Client.class.getName());
	
	public static void main(String args[]) {
		
		//get the type of cloud provider factory e.g private cloud provider factory
		CloudFactory cloudFactory = PrivateCloudFactory.getInstance();
		//get the type of cloud provider object using factory e.g Openstack
		CloudManager cloud = cloudFactory.getCloud(PrivateCloudFactory.OPENSTACK_CLOUD);
		
		//Launch and get compute instance status
		Integer instanceId = cloud.launchComputeInstance("m1.small");
		String status = cloud.getComputeStatus(instanceId);
		LOGGER.info("Status of insatnce " + instanceId + " : " + status);
	} 
}
