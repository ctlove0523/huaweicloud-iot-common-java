package io.github.ctlove0523.common.push.dto.property;

import io.github.ctlove0523.common.push.dto.NotifyDataHeader;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DevicePropertyReportNotifyData {
	private NotifyDataHeader header;

	private DevicePropertyReport body;

}

