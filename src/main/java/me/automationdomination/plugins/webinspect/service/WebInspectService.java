package me.automationdomination.plugins.webinspect.service;

import java.util.List;

public interface WebInspectService {
	
	public List<String> retrieveSettings();
	
	public void retrieveScanFile(final String settings, final String scanName);

}
