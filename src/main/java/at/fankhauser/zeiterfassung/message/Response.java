package at.fankhauser.zeiterfassung.message;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
	private String status;
	private Object data;
	
	public Response(String status) {
		this.status = status;
	}
}
