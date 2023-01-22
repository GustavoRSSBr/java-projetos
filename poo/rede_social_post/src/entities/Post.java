package entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private Instant instant;
	private String title;
	private String content;
	private Integer likes;

	List<Comment> comments = new ArrayList<>();

	public Post() {

	}

	public Post(Instant instant, String title, String content, Integer likes) {
		this.instant = instant;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Instant getInstant() {
		return instant;
	}

	public void setInstant(Instant instant) {
		this.instant = instant;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComent(Comment c) {
		comments.add(c);
	}

	public void removeComent(Comment c) {
		comments.remove(c);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(instant.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))
				+ "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}

		return sb.toString();
	}

}
