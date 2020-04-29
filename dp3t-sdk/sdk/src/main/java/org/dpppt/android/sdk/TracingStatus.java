/*
 * Created by Ubique Innovation AG
 * https://www.ubique.ch
 * Copyright (c) 2020. All rights reserved.
 */
package org.dpppt.android.sdk;

import java.util.Collection;
import java.util.List;

import org.dpppt.android.sdk.internal.database.models.MatchedContact;

public class TracingStatus {

	private int numberOfContacts;
	private boolean advertising;
	private boolean receiving;
	private long lastSyncDate;
	private InfectionStatus infectionStatus;
	private List<MatchedContact> matchedContacts;
	private Collection<ErrorState> errors;

	public TracingStatus(int numberOfContacts, boolean advertising, boolean receiving,
			long lastSyncDate,
			InfectionStatus infectionStatus, List<MatchedContact> matchedContacts, Collection<ErrorState> errors) {
		this.numberOfContacts = numberOfContacts;
		this.advertising = advertising;
		this.receiving = receiving;
		this.lastSyncDate = lastSyncDate;
		this.infectionStatus = infectionStatus;
		this.matchedContacts = matchedContacts;
		this.errors = errors;
	}

	public int getNumberOfContacts() {
		return numberOfContacts;
	}

	public boolean isAdvertising() {
		return advertising;
	}

	public boolean isReceiving() {
		return receiving;
	}

	public long getLastSyncDate() {
		return lastSyncDate;
	}

	public InfectionStatus getInfectionStatus() {
		return infectionStatus;
	}

	public List<MatchedContact> getMatchedContacts() {
		return matchedContacts;
	}

	public Collection<ErrorState> getErrors() {
		return errors;
	}

	public enum ErrorState {
		MISSING_LOCATION_PERMISSION(R.string.dp3t_sdk_service_notification_error_location_permission),
		LOCATION_SERVICE_DISABLED(R.string.dp3t_sdk_service_notification_error_location_service),
		BLE_DISABLED(R.string.dp3t_sdk_service_notification_error_bluetooth_disabled),
		BLE_NOT_SUPPORTED(R.string.dp3t_sdk_service_notification_error_bluetooth_not_supported),
		BLE_INTERNAL_ERROR(R.string.dp3t_sdk_service_notification_error_bluetooth_internal_error),
		BLE_ADVERTISING_ERROR(R.string.dp3t_sdk_service_notification_error_bluetooth_advertising_error),
		BLE_SCANNER_ERROR(R.string.dp3t_sdk_service_notification_error_bluetooth_scanner_error),
		BATTERY_OPTIMIZER_ENABLED(R.string.dp3t_sdk_service_notification_error_battery_optimization),
		SYNC_ERROR_SERVER(R.string.dp3t_sdk_service_notification_error_sync_server),
		SYNC_ERROR_NETWORK(R.string.dp3t_sdk_service_notification_error_sync_network),
		SYNC_ERROR_DATABASE(R.string.dp3t_sdk_service_notification_error_sync_database),
		SYNC_ERROR_TIMING(R.string.dp3t_sdk_service_notification_error_sync_timing),
		SYNC_ERROR_SIGNATURE(R.string.dp3t_sdk_service_notification_error_sync_signature);

		private int errorString;

		ErrorState(int errorString) {
			this.errorString = errorString;
		}

		public int getErrorString() {
			return errorString;
		}
	}

}
