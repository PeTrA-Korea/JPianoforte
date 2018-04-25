/**
 * Project JPianoforte
 * Digital Piano Engine with JAVA
 * copyright PeTrA (c) 2018 All rights reserved.
 */

package jpianoforte;

import java.util.LinkedList;
import java.util.List;

/**
 * jpfnote class
 * @author PeTrA
 * the one musical note data
 */
public class JpfNote {
	/**
	 * value of one musical note.
	 * 
	 * <<code>> : String List (Linked List)
	 * A0 A0# B0 C1 C1# D1 D1# E1 F1 F1# G1 G1#
	 * A1 A1# B1 C2 C2# D2 D2# E2 F2 F2# G2 G2#
	 * A2 A2# B2 C3 C3# D3 D3# E3 F3 F3# G3 G3#
	 * A3 A3# B3 C4 C4# D4 D4# E4 F4 F4# G4 G4#
	 * A4 A4# B4 C5 C5# D5 D5# E5 F5 F5# G5 G5#
	 * A5 A5# B5 C6 C6# D6 D6# E6 F6 F6# G6 G6#
	 * A6 A6# B6 C7 C7# D7 D7# E7 F7 F7# G7 G7#
	 * A7 A7# B7 C8
	 * 
	 * <<length>> : Integer
	 * 1, 1/2, 1/4, 1/8, 1/16, 1/32, 1/64
	 * 
	 * <<staccato>> : boolean (Origin Staccato)
	 * True, False
	 * 
	 * <<rest>> : boolean
	 * True, False
	 * 
	 * <<pedal>> : boolean (Damper Pedal)
	 * True, False
	 */
	
	private List<String> code = new LinkedList<>();
	private double length;
	private boolean staccato;
	private boolean rest;
	private boolean pedal;
	
	public JpfNote(List<String> _code, double _length, boolean _staccato, boolean _rest, boolean _pedal) {
		this.code = _code;
		this.length = _length;
		this.staccato = _staccato;
		this.rest = _rest;
		this.pedal = _pedal;
	}
	
	/**
	 * reset jpf note
	 * @param _code
	 * @param _length
	 * @param _staccato
	 * @param _rest
	 * @param _pedal
	 * @return
	 */
	public void setJpfNote(List<String> _code, double _length, boolean _staccato, boolean _rest, boolean _pedal) {
		this.code = _code;
		this.length = _length;
		this.staccato = _staccato;
		this.rest = _rest;
		this.pedal = _pedal;
	}
	
	public List<String> getCode(){
		return this.code;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public boolean getStaccato() {
		return this.staccato;
	}
	
	public boolean getRest() {
		return this.rest;
	}
	
	public boolean getPedal() {
		return this.pedal;
	}
	
	public void setCode(List<String> _code) {
		this.code = _code;
	}
	
	public void setLength(double _length) {
		this.length = _length;
	}
	
	public void setStaccato(boolean _staccato) {
		this.staccato = _staccato;
	}
	
	public void setRest(boolean _rest) {
		this.rest = _rest;
	}
	
	public void setPedal(boolean _pedal) {
		this.pedal = _pedal;
	}
	
	/**
	 * get disposable note function
	 * @param _code
	 * @param _length
	 * @param _staccato
	 * @param _rest
	 * @param _pedal
	 * @return (JpfNote)temp
	 */
	public static JpfNote getDisposableNote(List<String> _code, double _length, boolean _staccato, boolean _rest, boolean _pedal) {
		JpfNote temp = new JpfNote(_code, _length, _staccato, _rest, _pedal);
		return temp;
	}
}
