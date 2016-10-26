package in.gndec.sunehag.xmpp.jingle;

import in.gndec.sunehag.entities.DownloadableFile;

public interface OnFileTransmissionStatusChanged {
	void onFileTransmitted(DownloadableFile file);

	void onFileTransferAborted();
}
