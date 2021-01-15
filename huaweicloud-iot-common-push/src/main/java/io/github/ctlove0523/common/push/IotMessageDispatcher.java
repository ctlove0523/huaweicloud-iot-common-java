package io.github.ctlove0523.common.push;


import io.github.ctlove0523.common.push.handlers.IotBatchTaskUpdateHandler;
import io.github.ctlove0523.common.push.handlers.IotDeviceCommandStatusUpdateHandler;
import io.github.ctlove0523.common.push.handlers.IotDeviceCreatedHandler;
import io.github.ctlove0523.common.push.handlers.IotDeviceDeletedHandler;
import io.github.ctlove0523.common.push.handlers.IotDeviceMessageHandler;
import io.github.ctlove0523.common.push.handlers.IotDeviceMessageStatusUpdateHandler;
import io.github.ctlove0523.common.push.handlers.IotDevicePropertyReportHandler;
import io.github.ctlove0523.common.push.handlers.IotDeviceStatusUpdateHandler;
import io.github.ctlove0523.common.push.handlers.IotDeviceUpdateHandler;
import io.github.ctlove0523.common.push.handlers.IotProductCreatedHandler;
import io.github.ctlove0523.common.push.handlers.IotProductDeletedHandler;
import io.github.ctlove0523.common.push.handlers.IotProductUpdateHandler;

public interface IotMessageDispatcher {

	void dispatch(IotPushMessage message);

	IotMessageDispatcher addIotBatchTaskUpdateHandler(IotBatchTaskUpdateHandler handler);

	IotMessageDispatcher addIotDeviceCommandStatusUpdateHandler(IotDeviceCommandStatusUpdateHandler handler);

	IotMessageDispatcher addIotDeviceCreatedHandler(IotDeviceCreatedHandler handler);

	IotMessageDispatcher addIotDeviceDeletedHandler(IotDeviceDeletedHandler handler);

	IotMessageDispatcher addIotDeviceMessageHandler(IotDeviceMessageHandler handler);

	IotMessageDispatcher addIotDeviceMessageStatusUpdateHandler(IotDeviceMessageStatusUpdateHandler handler);

	IotMessageDispatcher addIotDevicePropertyReportHandler(IotDevicePropertyReportHandler handler);

	IotMessageDispatcher addIotDeviceStatusUpdateHandler(IotDeviceStatusUpdateHandler handler);

	IotMessageDispatcher addIotDeviceUpdateHandler(IotDeviceUpdateHandler handler);

	IotMessageDispatcher addIotProductCreatedHandler(IotProductCreatedHandler handler);

	IotMessageDispatcher addIotProductDeletedHandler(IotProductDeletedHandler handler);

	IotMessageDispatcher testIotProductUpdateHandler(IotProductUpdateHandler handler);
}
