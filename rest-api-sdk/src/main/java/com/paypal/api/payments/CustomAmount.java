package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.Getter; import lombok.Setter;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CustomAmount extends PayPalModel {

	/**
	 * The custom amount label. Maximum length is 25 characters.
	 */
	private String label;

	/**
	 * The custom amount value. Valid range is from -999999.99 to 999999.99.
	 */
	private Currency amount;

	/**
	 * Default Constructor
	 */
	public CustomAmount() {
	}
}
