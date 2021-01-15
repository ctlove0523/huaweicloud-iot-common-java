package io.github.ctlove0523.common.push.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeviceMessageReportNotifyData {
	private NotifyDataHeader header;
	private DeviceMessageReport body;

}
