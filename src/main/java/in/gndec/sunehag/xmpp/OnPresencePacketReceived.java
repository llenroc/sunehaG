package in.gndec.sunehag.xmpp;

import in.gndec.sunehag.entities.Account;
import in.gndec.sunehag.xmpp.stanzas.PresencePacket;

public interface OnPresencePacketReceived extends PacketReceived {
	public void onPresencePacketReceived(Account account, PresencePacket packet);
}
