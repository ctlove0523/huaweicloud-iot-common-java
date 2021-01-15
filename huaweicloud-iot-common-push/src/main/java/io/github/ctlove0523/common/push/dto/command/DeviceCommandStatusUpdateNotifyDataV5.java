package io.github.ctlove0523.common.push.dto.command;

import io.github.ctlove0523.common.push.dto.NotifyDataHeader;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DeviceCommandStatusUpdateNotifyDataV5 {
	private NotifyDataHeader header;

	private DeviceCommandStatusUpdate body;

}

