package nl.ocs.java.ev3.domain;

public class Response {

	private MessageType type;
	private Object content;

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
}
