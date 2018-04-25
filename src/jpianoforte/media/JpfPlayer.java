/**
 * Project JPianoforte
 * Digital Piano Engine with JAVA
 * copyright PeTrA (c) 2018 All rights reserved.
 */

package jpianoforte.media;

public class JpfPlayer {
	private int[] note;
	
	public JpfPlayer() {
		this.note = new int[5];
	}
	
	public void touchPiano(JpfNote _jpfNote) {
		_touchPiano(_jpfNote);
	}
	
	/**
	 * touch piano function
	 * @param _jpfNote
	 * @return
	 */
	private void _touchPiano(JpfNote _jpfNote) {
		JpfMakeMusicalNote jpfMakeMusicalNote = new JpfMakeMusicalNote();
		jpfMakeMusicalNote.setJpfNote(_jpfNote);
		this.note = jpfMakeMusicalNote.changeKeyNoteToMidiNote();
		
		for(int i = 0; i < this.note.length; i++) {
			
		}
	}
}
