package com.jarvis.rpc;

import org.apache.hadoop.ipc.VersionedProtocol;

public interface ProtocolReciver extends VersionedProtocol {
	public static final long versionID = 137L;

	public boolean report(String msg);

}