package br.com.test.config;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AppConfig {
	
	private static AppConfig INSTANCE;
	
	public String caminhoWebDriver;
	
	public String getCaminhoWebDriver() {
		return caminhoWebDriver;
	}
	
	public void getCaminhoWebDriver(String caminhoWebDriver) {
		this.caminhoWebDriver = caminhoWebDriver;
	}
	
	public static AppConfig getConfig() {
		if(INSTANCE == null) {
			
			try {
				ObjectMapper mapper = new ObjectMapper();
				byte[] configBytes = Files.readAllBytes(Paths.get(AppConfig.class.getResource("/appconfig.json").toURI()));
				String jsonConfig = new String(configBytes,"UTF-8");
				INSTANCE = mapper.readValue(jsonConfig, AppConfig.class);
				
			} catch (IOException | URISyntaxException e1) {
				e1.printStackTrace();
			}
		}
		return INSTANCE;
	}
}