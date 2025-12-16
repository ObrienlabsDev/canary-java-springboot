package dev.obrienlabs.canary.service;

import java.util.logging.Logger;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService implements ApplicationServiceLocal {
	
	private final static Logger LOG = Logger.getLogger(ApplicationService.class.getName());

	@Override
	public String health() {
		return "OK";
	}
}
