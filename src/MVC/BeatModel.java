package MVC;

import java.util.ArrayList;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;

import com.sun.tools.internal.xjc.reader.gbind.Sequence;

public class BeatModel implements BeatModelInterface, MetaEventListener {
	Sequencer sequencer;
	ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
	int bpm = 90;
	Sequence sequence;
	Track track;

	@Override
	public void initialize() {
		setUpMidi();
		buildTrackAndStart();

	}

	private void buildTrackAndStart() {
		// TODO Auto-generated method stub

	}

	private void setUpMidi() {
		// TODO Auto-generated method stub

	}

	@Override
	public void on() {
		sequencer.start();
		setBPM(90);
	}

	@Override
	public void off() {
		setBPM(0);
		sequencer.stop();

	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getBPM() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void registerObserver(BeatObserver o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeObserver(BeatObserver o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerObserver(BPMObserver o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeObserver(BPMObserver o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void meta(MetaMessage arg0) {
		// TODO Auto-generated method stub

	}

}
