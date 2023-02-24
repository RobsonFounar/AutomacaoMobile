package br.com.ideamaker.core;

public class ConfigSistemaIos {

	private String APP;
	private String PLATFORM_NAME;
	private String DEVICE_NAME;
	private String PLATFORM_VERSION;

	public ConfigSistemaIos(String APP, String PLATFORM_NAME, String DEVICE_NAME, String PLATFORM_VERSION) {
		this.APP = APP;
		this.PLATFORM_NAME = PLATFORM_NAME;
		this.DEVICE_NAME = DEVICE_NAME;
		this.PLATFORM_VERSION = PLATFORM_VERSION;
	}

	public String getAPP() {
		return this.APP;
	}

	public String getPLATFORM_NAME() {
		return this.PLATFORM_NAME;
	}

	public String getDEVICE_NAME() {
		return this.DEVICE_NAME;
	}

	public String getPLATFORM_VERSION() {
		return this.PLATFORM_VERSION;
	}
}