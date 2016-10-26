package in.gndec.sunehag.xmpp.stanzas.csi;

import in.gndec.sunehag.xmpp.stanzas.AbstractStanza;

public class ActivePacket extends AbstractStanza {
	public ActivePacket() {
		super("active");
		setAttribute("xmlns", "urn:xmpp:csi:0");
	}
}
