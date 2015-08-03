package entities;

import org.lwjgl.input.Keyboard;
import org.lwjgl.util.vector.Vector3f;

public class Camera {
	
	private Vector3f position = new Vector3f(0,0,0);
	private float pitch; // high or low
	private float yaw; // left or right
	private float roll; // tilted
	
	// V
	private Entity entity;
	
	public Camera(Entity entity) {
		this.entity = entity;
	}
	// ^
	
	public void move() {
		// V
		if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
			if(Keyboard.isKeyDown(Keyboard.KEY_W)) {
				entity.increaseRotation(1, 0, 0);
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_A)) {
				entity.increaseRotation(0, 1, 0);
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_S)) {
				entity.increaseRotation(-1, 0, 0);
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_D)) {
				entity.increaseRotation(0, -1, 0);
			}
		} else {
		// ^
			if(Keyboard.isKeyDown(Keyboard.KEY_W)) {
				position.z -= 0.02f;
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_A)) {
				position.x -= 0.02f;
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_S)) {
				position.z += 0.02f;
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_D)) {
				position.x += 0.02f;
			}
		} // <
	}
	
	public Vector3f getPosition() {
		return position;
	}
	
	public float getPitch() {
		return pitch;
	}
	
	public float getYaw() {
		return yaw;
	}
	
	public float getRoll() {
		return roll;
	}

}
