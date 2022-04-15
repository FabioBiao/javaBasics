package polymorphysm;

class MachineTwo {
	public void start() {
		System.out.println("Machine started.");
	}
}

class Camera extends MachineTwo {
	public void start() {
		System.out.println("Camera started.");
	}

	public void snap() {
		System.out.println("Photo taken.");
	}
}
// continuing polymorphysm
public class UpcastingDowncasting {
	public static void main(String[] args) {

		MachineTwo machine1 = new MachineTwo();
		Camera camera1 = new Camera();

		machine1.start();
		camera1.start();
		camera1.snap();

		// Upcasting
		MachineTwo machine2 = camera1;
		machine2.start();
		// error: machine2.snap();

		System.out.println("");
		
		// Downcasting
		MachineTwo machine3 = new Camera();
		Camera camera2 = (Camera) machine3;
		camera2.start();
		camera2.snap();

		// Doesn't work (lines commented bellow) --- runtime error.
		// can't change a object to another object, all we can do is change the 
		MachineTwo machine4 = new MachineTwo();
		// Camera camera3 = (Camera)machine4;
		// camera3.start();
		// camera3.snap();
	}
}
