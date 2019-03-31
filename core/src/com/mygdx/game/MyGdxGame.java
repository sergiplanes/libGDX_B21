package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class MyGdxGame extends ApplicationAdapter {
	private Stage stage;
	private Skin skin;
	
	@Override
	public void create () {
		skin = new Skin(Gdx.files.internal("uiskin.json"));
		stage = new Stage(new ScreenViewport());

		final TextButton textButton = new TextButton("Click Me", skin, "default");
		textButton.setWidth(200);
		textButton.setHeight(50);

		final Dialog dialog = new Dialog("Click Message", skin);

		stage.addActor(textButton);
		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	}
	
	@Override
	public void dispose () {
	}
}
