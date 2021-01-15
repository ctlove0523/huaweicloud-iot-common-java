package io.github.ctlove0523.common.push.dto.devicestatus;

import io.github.ctlove0523.common.push.dto.NotifyDataHeader;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DeviceStatusUpdateNotifyDataV5 {
	private NotifyDataHeader header;

	private DeviceStatusUpdate body;

}

