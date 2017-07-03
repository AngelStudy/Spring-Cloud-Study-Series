package com.jeestudy.hct.conditional;

public class LinuxCmdService implements CmdService{

	@Override
	public String getShowCmd() {
		return "dir";
	}

}
