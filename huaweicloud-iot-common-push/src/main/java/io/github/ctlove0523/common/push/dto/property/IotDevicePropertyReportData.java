package io.github.ctlove0523.common.push.dto.property;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ctlove0523.common.push.dto.BaseNotifyData;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class IotDevicePropertyReportData extends BaseNotifyData {


	@JsonProperty("notify_data")
	private DevicePropertyReportNotifyData notifyData;

}

