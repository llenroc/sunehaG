package in.gndec.sunehag.xmpp;

import in.gndec.sunehag.entities.Account;
import in.gndec.sunehag.xmpp.stanzas.MessagePacket;

public interface OnMessagePacketReceived extends PacketReceived {
	public void onMessagePacketReceived(Account account, MessagePacket packet);
}
