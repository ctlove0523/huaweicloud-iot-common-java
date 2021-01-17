package io.github.ctlove0523.common.push;

public class DefaultIotPushMessage implements IotPushMessage {
	private String body;

	public DefaultIotPushMessage(String body) {
		this.body = body;
	}

	@Override
	public String getBodyJsonString() {
		return body;
	}
}
