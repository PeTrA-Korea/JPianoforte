/**
 * Project JPianoforte
 * Digital Piano Engine with JAVA
 * copyright PeTrA (c) 2018 All rights reserved.
 */

package jpianoforte.media;

import java.util.LinkedList;
import java.util.List;

/**
 * jpf advanced note class
 * @author PeTrA
 * advanced musical note
 */
public class JpfAdvancedNote {
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
	 * <<staccato>> : String
	 * - STACCATO : origin staccato
	 * - STACCATISSIMO : staccatissimo
	 * - MEZZOSTACCATO : mezzo staccato
	 * 
	 * <<rest>> : boolean
	 * True, False
	 * 
	 * <<pedal>> : String
	 * - DAMPER : damper dedal
	 * - SOFT : soft pedal
	 * - SOSTENUTO : sostenuto pedal (grand)
	 */
	
	private List<String> code = new LinkedList<>();
	private int length;
	private String staccato;
	private boolean rest;
	private String pedal;
	
	public JpfAdvancedNote(List<String> _code, int _length, String _staccato, boolean _rest, String _pedal) {
		this.code = _code;
		this.length = _length;
		this.staccato = _staccato;
		this.rest = _rest;
		this.pedal = _pedal;
	}
	
	/**
	 * reset jpf advanced note.
	 * @param _code
	 * @param _length
	 * @param _staccato
	 * @param _rest
	 * @param _pedal
	 * @return
	 */
	public void setJpfAdvancedNote(List<String> _code, int _length, String _staccato, boolean _rest, String _pedal) {
		this.code = _code;
		this.length = _length;
		this.staccato = _staccato;
		this.rest = _rest;
		this.pedal = _pedal;
	}
	
	public void setCode(List<String> _code) {
		this.code = _code;
	}
	
	public void setLength(int _length) {
		this.length = _length;
	}
	
	public void setStaccato(String _staccato) {
		this.staccato = _staccato;
	}
	
	public void setRest(boolean _rest) {
		this.rest = _rest;
	}
	
	public void setPedal(String _pedal) {
		this.pedal = _pedal;
	}
	
	public List<String> getCode(){
		return this.code;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public String getStaccato() {
		return this.staccato;
	}
	
	public boolean getRest() {
		return this.rest;
	}
	
	public String getPedal() {
		return this.pedal;
	}
	
	/**
	 * get disposable note function
	 * @param _code
	 * @param _length
	 * @param _staccato
	 * @param _rest
	 * @param _pedal
	 * @return (JpfAdvancedNote)temp
	 */
	public JpfAdvancedNote getDisposableNote(List<String> _code, int _length, String _staccato, boolean _rest, String _pedal) {
		JpfAdvancedNote temp = new JpfAdvancedNote(_code, _length, _staccato, _rest, _pedal);
		return temp;
	}
}
