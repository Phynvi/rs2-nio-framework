package main.astraeus.net.protocol.codec.game;

/**
 * The enumerated types that represent the states at which
 * an incoming {@link IncomingPacket} is decoded.
 * 
 * @author SeVen
 */
public enum GamePacketDecoderState {
	
	/**
	 * The state that determines the id of this packet.
	 */
	OPCODE,
	
	/**
	 * The state that determines which type of packet this is.
	 */
	SIZE,
	
	/**
	 * The state that contains the data of the packet.
	 */
	PAYLOAD;

}
