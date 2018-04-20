/**
 * Project JPianoforte
 * Digital Piano Engine with JAVA
 * copyright PeTrA (c) 2018 All rights reserved.
 */

package jpianoforte;

/**
 * jpfMakeMusicalNote class
 * @author PeTrA
 * make musical note class
 */
public class JpfMakeMusicalNote {
	/**
	 * Piano Musical Note :: Key Board of Piano.
	 * 
	 * A0 A0# B0 C1 C1# D1 D1# E1 F1 F1# G1 G1#
	 * A1 A1# B1 C2 C2# D2 D2# E2 F2 F2# G2 G2#
	 * A2 A2# B2 C3 C3# D3 D3# E3 F3 F3# G3 G3#
	 * A3 A3# B3 C4 C4# D4 D4# E4 F4 F4# G4 G4#
	 * A4 A4# B4 C5 C5# D5 D5# E5 F5 F5# G5 G5#
	 * A5 A5# B5 C6 C6# D6 D6# E6 F6 F6# G6 G6#
	 * A6 A6# B6 C7 C7# D7 D7# E7 F7 F7# G7 G7#
	 * A7 A7# B7 C8
	 * 
	 * 88 KEY, 52 WHITE KEY, 36 BLACK KEY.
	 * A4 = 440 Hz
	 */
	private int keyNumber;
	
	public JpfMakeMusicalNote() {
		resetKeyNumber();
	}
	
	private void resetKeyNumber() {
		this.keyNumber = -1;
	}
	
	public int changeKeyNoteToMidiNote(String _keyNote) {
		return _changeKeyNoteToMidiNote(_keyNote);
	}
	
	/**
	 * chamge key note to java midi note function
	 * @param _keyNote
	 * @return this.keyNote
	 */
	private int _changeKeyNoteToMidiNote(String _keyNote) {
		resetKeyNumber();
		if(_keyNote.equals("A0")) {
			
		}else if(_keyNote.equals("A0#")) {
			
		}else if(_keyNote.equals("B0")) {
			
		}else if(_keyNote.equals("C1")) {
			
		}else if(_keyNote.equals("C1#")) {
			
		}else if(_keyNote.equals("D1")) {
			
		}else if(_keyNote.equals("D1#")) {
			
		}else if(_keyNote.equals("E1")) {
			
		}else if(_keyNote.equals("F1")) {
			
		}else if(_keyNote.equals("F1#")) {
			
		}else if(_keyNote.equals("G1")) {
			
		}else if(_keyNote.equals("G1#")) {
			
		}else if(_keyNote.equals("A1")) {
			
		}else if(_keyNote.equals("A1#")) {
			
		}else if(_keyNote.equals("B1")) {
			
		}else if(_keyNote.equals("C2")) {
			
		}else if(_keyNote.equals("C2#")) {
			
		}else if(_keyNote.equals("D2")) {
			
		}else if(_keyNote.equals("D2#")) {
			
		}else if(_keyNote.equals("E2")) {
			
		}else if(_keyNote.equals("F2")) {
			
		}else if(_keyNote.equals("F2#")) {
			
		}else if(_keyNote.equals("G2")) {
			
		}else if(_keyNote.equals("G2#")) {
			
		}else if(_keyNote.equals("A2")) {
			
		}else if(_keyNote.equals("A2#")) {
			
		}else if(_keyNote.equals("B2")) {
			
		}else if(_keyNote.equals("C3")) {
			
		}else if(_keyNote.equals("C3#")) {
			
		}else if(_keyNote.equals("D3")) {
			
		}else if(_keyNote.equals("D3#")) {
			
		}else if(_keyNote.equals("E3")) {
			
		}else if(_keyNote.equals("F3")) {
			
		}else if(_keyNote.equals("F3#")) {
			
		}else if(_keyNote.equals("G3")) {
			
		}else if(_keyNote.equals("G3#")) {
			
		}else if(_keyNote.equals("A3")) {
			
		}else if(_keyNote.equals("A3#")) {
			
		}else if(_keyNote.equals("B3")) {
			
		}else if(_keyNote.equals("C4")) {
			
		}else if(_keyNote.equals("C4#")) {
			
		}else if(_keyNote.equals("D4")) {
			
		}else if(_keyNote.equals("D4#")) {
			
		}else if(_keyNote.equals("E4")) {
			
		}else if(_keyNote.equals("F4")) {
			
		}else if(_keyNote.equals("F4#")) {
			
		}else if(_keyNote.equals("G4")) {
			
		}else if(_keyNote.equals("G4#")) {
			
		}else if(_keyNote.equals("A4")) {
			
		}else if(_keyNote.equals("A4#")) {
			
		}else if(_keyNote.equals("B4")) {
			
		}else if(_keyNote.equals("C5")) {
			
		}else if(_keyNote.equals("C5#")) {
			
		}else if(_keyNote.equals("D5")) {
			
		}else if(_keyNote.equals("D5#")) {
			
		}else if(_keyNote.equals("E5")) {
			
		}else if(_keyNote.equals("F5")) {
			
		}else if(_keyNote.equals("F5#")) {
			
		}else if(_keyNote.equals("G5")) {
			
		}else if(_keyNote.equals("G5#")) {
			
		}else if(_keyNote.equals("A5")) {
			
		}else if(_keyNote.equals("A5#")) {
			
		}else if(_keyNote.equals("B5")) {
			
		}else if(_keyNote.equals("C6")) {
			
		}else if(_keyNote.equals("C6#")) {
			
		}else if(_keyNote.equals("D6")) {
			
		}else if(_keyNote.equals("D6#")) {
			
		}else if(_keyNote.equals("E6")) {
			
		}else if(_keyNote.equals("F6")) {
			
		}else if(_keyNote.equals("F6#")) {
			
		}else if(_keyNote.equals("G6")) {
			
		}else if(_keyNote.equals("G6#")) {
			
		}else if(_keyNote.equals("A6")) {
			
		}else if(_keyNote.equals("A6#")) {
			
		}else if(_keyNote.equals("B6")) {
			
		}else if(_keyNote.equals("C7")) {
			
		}else if(_keyNote.equals("C7#")) {
			
		}else if(_keyNote.equals("D7")) {
			
		}else if(_keyNote.equals("D7#")) {
			
		}else if(_keyNote.equals("E7")) {
			
		}else if(_keyNote.equals("F7")) {
			
		}else if(_keyNote.equals("F7#")) {
			
		}else if(_keyNote.equals("G7")) {
			
		}else if(_keyNote.equals("G7#")) {
			
		}else if(_keyNote.equals("A7")) {
			
		}else if(_keyNote.equals("A7#")) {
			
		}else if(_keyNote.equals("B7")) {
			
		}else if(_keyNote.equals("C8")) {
			
		}
		
		return this.keyNumber;
	}
	
}
