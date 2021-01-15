package io.github.ctlove0523.common.push.dto.device;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ctlove0523.common.push.dto.BaseNotifyData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IotDeviceDeleteData extends BaseNotifyData {
	@JsonProperty("notify_data")
	private DeviceDeleteNotifyData notifyData;
}
