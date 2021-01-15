package io.github.ctlove0523.common.push.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IotDeviceMessage {
	private String resource;

	private String event;

	@JsonProperty("event_time")
	private String eventTime;

	@JsonProperty("notify_data")
	private DeviceMessageReportNotifyData notifyData;
}
