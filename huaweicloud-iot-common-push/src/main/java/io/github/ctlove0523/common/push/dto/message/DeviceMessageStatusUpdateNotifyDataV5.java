package io.github.ctlove0523.common.push.dto.message;

import io.github.ctlove0523.common.push.dto.NotifyDataHeader;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DeviceMessageStatusUpdateNotifyDataV5 {
	private NotifyDataHeader header;

	private DeviceMessageStatusUpdate body;

}

