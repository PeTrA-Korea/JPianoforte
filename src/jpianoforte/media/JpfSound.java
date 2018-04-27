/**
 * Project JPianoforte
 * Digital Piano Engine with JAVA
 * copyright PeTrA (c) 2018 All rights reserved.
 */

package jpianoforte.media;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 * jpfsound class
 * @author PeTrA
 * play piano keyboard sound class
 */
public class JpfSound {
	private int INSTRUMENT = 1;
	private MidiChannel CHANNEL;
	
	public JpfSound() throws MidiUnavailableException {
		this.CHANNEL = getChannel(this.INSTRUMENT);
	}
	
	/**
	 * get MidiChannel function
	 * @param _instrument
	 * @return synthesizer.getChannels()[_instrument]
	 * @throws MidiUnavailableException
	 */
	private static MidiChannel getChannel(int _instrument) throws MidiUnavailableException {
		Synthesizer synthesizer = MidiSystem.getSynthesizer();
		synthesizer.open();
		return synthesizer.getChannels()[_instrument];
	}
	
	/**
	 * making
	 * @throws InterruptedException 
	 */
	public void touchKeyboard(final int _midiNote, final long _length) throws InterruptedException {
		playMidiPlayer(_midiNote, _length);
		return;
	}
	
	/**
	 * midi play function
	 * @param _musicalNote
	 * @param _length
	 * @return
	 * @throws InterruptedException
	 */
	private void playMidiPlayer(final int _midiNote, final long _length) throws InterruptedException{
		this.CHANNEL.noteOn(_midiNote, 50);
		Thread.sleep(_length);
		this.CHANNEL.noteOff(_midiNote, 50);
		return;
	}
	
}
