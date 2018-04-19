/**
 * Project JPianoforte
 * Digital Piano Engine with JAVA
 * copyright PeTrA (c) 2018 All rights reserved.
 */

package jpianoforte;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class jpfSound {
	private int INSTRUMENT = 1;
	private MidiChannel CHANNEL;
	
	public jpfSound() throws MidiUnavailableException {
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
	 */
	public void touchKeyboard() {
		
	}
	
	/**
	 * midi play function
	 * @param _musicalNote
	 * @param _length
	 * @return
	 * @throws InterruptedException
	 */
	private void _touchKeyboard(final int _musicalNote, final long _length) throws InterruptedException{
		this.CHANNEL.noteOn(_musicalNote, 50);
		Thread.sleep(_length);
		this.CHANNEL.noteOff(_musicalNote, 50);
		return;
	}
	
}
