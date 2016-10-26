package in.gndec.sunehag.xmpp.stanzas.streammgmt;

import in.gndec.sunehag.xmpp.stanzas.AbstractStanza;

public class EnablePacket extends AbstractStanza {

	public EnablePacket(int smVersion) {
		super("enable");
		this.setAttribute("xmlns", "urn:xmpp:sm:" + smVersion);
		this.setAttribute("resume", "true");
	}

}
