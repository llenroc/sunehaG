package in.gndec.sunehag.xmpp;

import in.gndec.sunehag.crypto.axolotl.AxolotlService;

public interface OnKeyStatusUpdated {
	public void onKeyStatusUpdated(AxolotlService.FetchStatus report);
}
