package br.com.ideamaker.core;

public class ConfigSistema {
	private ConfigSistemaAndroid android;
	private ConfigSistemaIos ios;

	public ConfigSistema(ConfigSistemaAndroid android, ConfigSistemaIos ios) {
		this.android = android;
		this.ios = ios;
	}

	public ConfigSistemaAndroid getAndroid() {
		return android;
	}

	public ConfigSistemaIos getIos() {
		return ios;
	}
}