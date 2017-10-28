package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.TimeUtils;

public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture img2;
	BitmapFont font;


	
	@Override
	public void create () {
		batch = new SpriteBatch();
		//img = new Texture("badlogic.jpg");
		img2 = new Texture("oil.png");
		font = new BitmapFont();
		font.setColor(1,1,1,1);
        Usefuls.STARTTIME = TimeUtils.millis();
	}

	@Override
	public void render () {
		//change background color
	    Gdx.gl.glClearColor(
		        Usefuls.getSlowSineWithOffset(0,6.28f)*.8f,
                Usefuls.getSlowSineWithOffset(4,6.28f)*.8f,
                Usefuls.getSlowSineWithOffset(2,6.28f)*.8f,
                1);

        //Gdx.gl.glClearColor(.5f,.5f,.5f,.5f);

        //---------------------------------------
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//batch.draw(img, 0, 0);
		batch.draw(img2, Gdx.input.getX() - (img2.getWidth()/2), Gdx.graphics.getHeight() - Gdx.input.getY() - (img2.getHeight()/2));

		//output rgb values
		font.draw(batch,
		"R: " + String.valueOf(Usefuls.getSlowSineWithOffset(0,6.28f)) + "\n" +
        "G: " + String.valueOf(Usefuls.getSlowSineWithOffset(2,6.28f)) + "\n" +
        "B: " + String.valueOf(Usefuls.getSlowSineWithOffset(4,6.28f)),
        200,Gdx.graphics.getHeight()-200);
		font.getData().setScale(5);

		batch.end();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}