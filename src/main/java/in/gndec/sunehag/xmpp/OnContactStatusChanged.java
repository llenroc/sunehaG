package in.gndec.sunehag.xmpp;

import in.gndec.sunehag.entities.Contact;

public interface OnContactStatusChanged {
	public void onContactStatusChanged(final Contact contact, final boolean online);
}
