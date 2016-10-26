package in.gndec.sunehag.xmpp.jingle;

import in.gndec.sunehag.entities.Account;
import in.gndec.sunehag.xmpp.PacketReceived;
import in.gndec.sunehag.xmpp.jingle.stanzas.JinglePacket;

public interface OnJinglePacketReceived extends PacketReceived {
	void onJinglePacketReceived(Account account, JinglePacket packet);
}
