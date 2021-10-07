package com.etiya.ReCapProject.entities.requests.colorRequests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.etiya.ReCapProject.business.constants.Messages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateColorRequest {
	
	@NotBlank(message = Messages.NOTNULL)
	@NotNull
	private String colorName;
}

