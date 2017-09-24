package cn.edu.njupt.liuqhahah.buckyblaster;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**


 */
public class MyGdxGame extends ApplicationAdapter {
    private SpriteBatch batch;
    private BitmapFont font;

    private Texture img;
    private Sprite sprite;

    @Override
    public void create() {

        batch = new SpriteBatch();

        img = new Texture("atm.jpg");
        sprite = new Sprite(img);


        font = new BitmapFont();
        font.setColor(Color.BLUE);


        //can not set font size
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        batch.begin();
        //显示string，
        font.draw(batch, "Hello baby dont say maybe", 500, 600);
        //显示图片
        sprite.draw(batch);
        batch.end();

    }

    @Override
    public void dispose() {
        //防止内存泄漏
        batch.dispose();
        font.dispose();
        img.dispose();

    }
}
