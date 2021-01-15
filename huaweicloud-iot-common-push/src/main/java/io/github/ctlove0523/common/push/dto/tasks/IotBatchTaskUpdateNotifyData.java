package io.github.ctlove0523.common.push.dto.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ctlove0523.common.push.dto.BaseNotifyData;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class IotBatchTaskUpdateNotifyData extends BaseNotifyData {
	@JsonProperty("notify_data")
	private BatchTaskUpdateNotifyData notifyData;

}

