package br.com.ideamaker.config;

import br.com.ideamaker.core.ConfigSistema;

public class Config {

	public static ConfigSistema getConfigSistema() {
		// Definir sistema que será testado.
		IConfig app = new AppCentroOeste();
		return app.getConfig();
	}

	public static String getPlatform() {
		// android ou ios
		return "android";
	}
}