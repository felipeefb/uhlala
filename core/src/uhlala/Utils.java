package uhlala;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public class Utils {
	private final static int MAX_WIDTH = Gdx.graphics.getWidth();
	private final static int MAX_HEIGHT = Gdx.graphics.getHeight();
	
	public static float percentToWidth(float n){
		return MAX_WIDTH*n/100;
	}
	
	public static float percentToHeight(float n){
		return MAX_HEIGHT*n/100;
	}
	
	public static Vector2 percentToAbs(Vector2 pos){
		return new Vector2(percentToWidth(pos.x), percentToHeight(pos.y));
	}
}
