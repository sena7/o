package common.model;

import java.time.LocalDateTime;

public class Thought {
	private String id;
	private LocalDateTime dateCreated;
	private LocalDateTime dateUpdated;
    private String text;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	public LocalDateTime getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(LocalDateTime dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Note [id=" + id + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + ", text=" + text
				+ "]";
	}

	
}
