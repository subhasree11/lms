public class Member {
	
	private String email,from,to,reason;

	
	public Member() {
		super();
	}

	public Member(String email, String from, String to, String reason) {
		super();
		this.email = email;
		this.from = from;
		this.to = to;
		this.reason = reason;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}

	public String getReason() {
		return reason;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
}

	