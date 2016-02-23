package iface;

public interface CloudFactory {
	CloudManager getCloud(String cloudType);
}
