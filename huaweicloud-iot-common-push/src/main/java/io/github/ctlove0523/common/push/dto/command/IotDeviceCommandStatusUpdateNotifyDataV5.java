package io.github.ctlove0523.common.push.dto.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ctlove0523.common.push.dto.BaseNotifyData;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class IotDeviceCommandStatusUpdateNotifyDataV5 extends BaseNotifyData {
	@JsonProperty("notifyData")
	private DeviceCommandStatusUpdateNotifyDataV5 notifyData;

}



