package uhlala;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.CentripetalAcceleration;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;

public class uhlalaMain extends ApplicationAdapter {
	private static int WIDTH;
	private static int HEIGHT;

	private SpriteBatch batch;
	private ShapeRenderer shape;

	private Vector2[] sexualPositions = new Vector2[5];
	private Vector2 rollCenter = new Vector2(100, 50);

	@Override
	public void create() {
		batch = new SpriteBatch();
		shape = new ShapeRenderer();
		WIDTH = Gdx.graphics.getWidth();
		HEIGHT = Gdx.graphics.getHeight();
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		drawBackgroud();
		drawSymbol();
		drawRoll();
		batch.end();
	}

	private void drawBackgroud() {
		shape.begin(ShapeType.Filled);
		shape.identity();
		shape.setColor(Color.GRAY);
		shape.rect(0, 0, WIDTH, HEIGHT);
		shape.end();
	}

	private void drawSymbol() {
		shape.begin(ShapeType.Filled);
		shape.identity();
		shape.setColor(Color.RED);
		shape.circle(75, HEIGHT - 75, 50);
		shape.end();
	}
	
	private void drawRoll() {
		shape.begin(ShapeType.Line);
		shape.identity();
		shape.setColor(Color.RED);
		Vector2 center = Utils.percentToAbs(rollCenter);
		shape.circle(center.x, center.y, Utils.percentToWidth(35));
		shape.end();
	}
}
