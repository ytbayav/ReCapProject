package com.etiya.ReCapProject.entities.requests.colorRequests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.etiya.ReCapProject.business.constants.Messages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateColorRequest {
	
	@NotNull
	private int colorId;
	
	@NotBlank(message = Messages.NOTNULL)
	@NotNull
	private String colorName;
}
