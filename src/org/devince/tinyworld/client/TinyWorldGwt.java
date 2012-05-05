package org.devince.tinyworld.client;

import org.devince.tinyworld.TinyWorld;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.google.gwt.user.client.ui.RootPanel;

public class TinyWorldGwt extends GwtApplication {

	public GwtApplicationConfiguration getConfig() {
		GwtApplicationConfiguration configuration = new GwtApplicationConfiguration(TinyWorld.WIDTH, TinyWorld.HEIGHT);		
		configuration.useDebugGL = false;
		configuration.rootPanel = RootPanel.get("container");		
		return configuration;
	}

	public ApplicationListener getApplicationListener() {
		TinyWorld game = TinyWorld.get();
		game.setGWT(true);
		return game;
	}

}
