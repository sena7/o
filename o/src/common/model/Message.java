package common.model;

import java.util.Date;

import constant.MessageType;

public class Message {
  
	private Date date;
	private Integer sequence;
	private String message;
    private MessageType messageType;
	public Message(Date date, Integer sequence, String message, MessageType messageType) {
		super();
		this.date = date;
		this.sequence = sequence;
		this.message = message;
		this.messageType = messageType;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public MessageType getMessageType() {
		return messageType;
	}
	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}
	@Override
	public String toString() {
		return "Message [date=" + date + ", sequence=" + sequence + ", message=" + message + ", messageType="
				+ messageType + ", getDate()=" + getDate() + ", getSequence()=" + getSequence() + ", getMessage()="
				+ getMessage() + ", getMessageType()=" + getMessageType() + "]";
	}

    
}
