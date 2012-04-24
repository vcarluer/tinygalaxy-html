package org.devince.tinyworld.client;

import org.devince.tinyworld.TinyWorld;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class TinyWorldGwt extends GwtApplication {

	public GwtApplicationConfiguration getConfig() {
		GwtApplicationConfiguration configuration = new GwtApplicationConfiguration(TinyWorld.WIDTH, TinyWorld.HEIGHT);
		configuration.useDebugGL = false;
		return configuration;
	}

	public ApplicationListener getApplicationListener() {
		return TinyWorld.get();
	}

}
