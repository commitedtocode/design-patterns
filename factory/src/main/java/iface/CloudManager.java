package iface;

public interface CloudManager {
	public Integer launchComputeInstance(String computeSize);
	public void storeObject(Object data);
	public String getComputeStatus(Integer id);
}
