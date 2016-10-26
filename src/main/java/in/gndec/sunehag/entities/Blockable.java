package in.gndec.sunehag.entities;

import in.gndec.sunehag.xmpp.jid.Jid;

public interface Blockable {
	public boolean isBlocked();
	public boolean isDomainBlocked();
	public Jid getBlockedJid();
	public Jid getJid();
	public Account getAccount();
}
