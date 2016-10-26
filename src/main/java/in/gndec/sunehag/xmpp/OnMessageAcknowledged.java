package in.gndec.sunehag.xmpp;

import in.gndec.sunehag.entities.Account;

public interface OnMessageAcknowledged {
	public void onMessageAcknowledged(Account account, String id);
}
