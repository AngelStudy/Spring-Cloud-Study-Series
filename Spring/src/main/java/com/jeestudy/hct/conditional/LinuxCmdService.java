package com.jeestudy.hct.conditional;

/**
 * 
 * @Title:LinuxCmdService.java
 * @Auth:Angel
 * @Date:2017-07-03 15:08:49
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class LinuxCmdService implements CmdService {

	@Override
	public String getShowCmd() {
		return "dir";
	}

}
