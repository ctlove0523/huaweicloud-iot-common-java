package io.github.ctlove0523.common.push.dto.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ctlove0523.common.push.dto.BaseNotifyData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IotProductDeletedData extends BaseNotifyData {

	@JsonProperty("notify_data")
	private ProductDeleteNotifyData notifyData;

}
