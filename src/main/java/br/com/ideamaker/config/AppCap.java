package br.com.ideamaker.config;

import java.io.File;

import br.com.ideamaker.core.ConfigSistema;
import br.com.ideamaker.core.ConfigSistemaAndroid;
import br.com.ideamaker.core.ConfigSistemaIos;
import io.appium.java_client.remote.MobilePlatform;

public class AppCap implements IConfig{
	
	public ConfigSistema getConfig() {
		// Configuração do android
		File apk = new File("./Drivers/vidacap-release.apk");
		ConfigSistemaAndroid android = new ConfigSistemaAndroid(apk.getAbsolutePath(), MobilePlatform.ANDROID,
				"com.ideamaker.vidacap.debug", "com.whitelabelcap.SplashActivity", "pixel 2", "9", "UiAutomator2");

		// Configuração do ios
		File fileIos = new File("./Drivers/qazandoapp.app");
		ConfigSistemaIos ios = new ConfigSistemaIos(fileIos.getAbsolutePath(), MobilePlatform.IOS, "iPhone 8 Plus",
				"11.4");

		// Retorna a configuração
		return new ConfigSistema(android, ios);
	}
}