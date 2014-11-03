import MVC.BeatController;
import MVC.BeatModel;
import MVC.BeatModelInterface;

public class DJTestDriver {

	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		new BeatController(model);

	}

}
