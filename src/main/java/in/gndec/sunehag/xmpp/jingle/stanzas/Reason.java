package in.gndec.sunehag.xmpp.jingle.stanzas;

import in.gndec.sunehag.xml.Element;

public class Reason extends Element {
	private Reason(String name) {
		super(name);
	}

	public Reason() {
		super("reason");
	}
}
