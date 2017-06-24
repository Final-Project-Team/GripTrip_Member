package spring.trip.domain;

public class Comment {
	// field
	private int commentNo;
	private String email;
	private int storyNo;
	private String commentContent;
	private String commentCreateDate;
	
	// constructors
	public Comment(){}
	
	public Comment(String commentContent){
		this.commentContent = commentContent;
	}
	
	public Comment(int commentNo, String commentContent){
		this.commentNo = commentNo;
		this.commentContent = commentContent;
	}
	
	public Comment(int commentNo, String email, String commentContent){
		this.commentNo = commentNo;
		this.email = email;
		this.commentContent = commentContent;
	}
	
	public Comment(int commentNo, String email, int storyNo, String commentContent, String commentCreateDate) {
		super();
		this.commentNo = commentNo;
		this.email = email;
		this.storyNo = storyNo;
		this.commentContent = commentContent;
		this.commentCreateDate = commentCreateDate;
	}
	
	// setters and getters
	public int getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStoryNo() {
		return storyNo;
	}

	public void setStoryNo(int storyNo) {
		this.storyNo = storyNo;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getCommentCreateDate() {
		return commentCreateDate;
	}

	public void setCommentCreateDate(String commentCreateDate) {
		this.commentCreateDate = commentCreateDate;
	}

	@Override
	public String toString() {
		return "Comment [commentNo=" + commentNo + ", email=" + email + ", storyNo=" + storyNo + ", commentContent="
				+ commentContent + ", commentCreateDate=" + commentCreateDate + "]";
	}
}
