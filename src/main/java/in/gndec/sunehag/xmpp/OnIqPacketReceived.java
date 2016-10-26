package in.gndec.sunehag.xmpp;

import in.gndec.sunehag.entities.Account;
import in.gndec.sunehag.xmpp.stanzas.IqPacket;

public interface OnIqPacketReceived extends PacketReceived {
	public void onIqPacketReceived(Account account, IqPacket packet);
}
