package iFace;

public class Friendship_Request {
	@SuppressWarnings("unused")
	private String sent, receive;

	public void setSent(String username) {
		this.sent = username;
	}

	public void setReceive(String username) {
		this.receive = username;
	}

	public String getSent() {
		return sent;
	}

	public String getReceive() {
		return receive;
	}
}
