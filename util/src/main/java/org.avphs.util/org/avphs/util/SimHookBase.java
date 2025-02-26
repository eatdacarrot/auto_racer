/* FakeFirmata -- a simple way to control servos from LattePanda in Java.
 *
 * This is essentially a translation of (small parts of) LattePanda's Arduino.cs
 * into Java for using the attached Arduino to control servos.
 *
 * Under US Copyright law this miniscule copy counts as "Fair Use" and in the
 * public domain, but if you are worried about it, or if you extend it to
 * include more of their code, then you will be bound by the onerous rules of
 * the GNU General Public License or whatever they are currently using.
 *
 * FakeFirmata is designed to work with JSSC (Java Simple Serial Connector),
 * but probably will work with any compatible Java serial port API.
 */
package org.avphs.util; // (class SimHookBase)      // 2018 December 18

/**
 * This is the base class for giving transparent access to the serial data
 * being sent to the Arduino servo controllers through the serial port.
 */
public class SimHookBase { // override to drive simulator

    public SimHookBase() {
        System.out.println("new SimHookBase");
    }

    /**
     * Override this method to see the data being sent to the Arduino.
     *
     * @param msg a byte array (typically 3 bytes long) with the MIDI
     *            coded message for the Arduino running Firmata.
     * @param lxx the number of bytes to consider (the msg parameter array
     *            may be longer than actual data being sent)
     */
    public void SendBytes(byte[] msg, int lxx) {
    }

    public String toString() {
        return "(SimHookBase)";
    } //~toString
} //~SimHookBase // (SB)
