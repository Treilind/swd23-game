package at.campus02.swd.game.gameobjects.tile;

import at.campus02.swd.game.gameobjects.GameObject;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Tile implements GameObject {

    //private String spritePath;
    //private Texture texture;
    private Sprite sprite;

    public Tile(Texture texture) {
        //this.spritePath = spritePath;
        //this.texture = texture;
        this.sprite = new Sprite(texture);
    }

    @Override
    public void act(float delta) {
    }

    @Override
    public void setPosition(float x, float y) {
        sprite.setPosition(x, y);
    }

    @Override
    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }

}
