package br.com.ideamaker.core;

public class ConfigSistemaAndroid {

	private String APP;
	private String PLATFORM_NAME;
	private String APP_PACKAGE;
	private String APP_ACTIVITY;
	private String DEVICE_NAME;
	private String PLATFORM_VERSION;
	private String AUTOMATION_NAME;

	public ConfigSistemaAndroid(String APP, String PLATFORM_NAME, String APP_PACKAGE, String APP_ACTIVITY,
			String DEVICE_NAME, String PLATFORM_VERSION, String AUTOMATION_NAME) {

		this.APP = APP;
		this.PLATFORM_NAME = PLATFORM_NAME;
		this.APP_PACKAGE = APP_PACKAGE;
		this.APP_ACTIVITY = APP_ACTIVITY;
		this.DEVICE_NAME = DEVICE_NAME;
		this.PLATFORM_VERSION = PLATFORM_VERSION;
		this.AUTOMATION_NAME = AUTOMATION_NAME;
	}

	public String getAPP() {
		return this.APP;
	}

	public String getPLATFORM_NAME() {
		return this.PLATFORM_NAME;
	}

	public String getAPP_PACKAGE() {
		return this.APP_PACKAGE;
	}

	public String getAPP_ACTIVITY() {
		return this.APP_ACTIVITY;
	}

	public String getDEVICE_NAME() {
		return this.DEVICE_NAME;
	}

	public String getPLATFORM_VERSION() {
		return this.PLATFORM_VERSION;
	}

	public String getAUTOMATION_NAME() {
		return this.AUTOMATION_NAME;
	}
}