package com.opencredo.demo.hateoas.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Post extends AbstractPersistable<Long> {
	private static final long serialVersionUID = 298443116673285961L;

	private String title;

	private String content;

	private String status;
	
	private String locale; 

	private Date create_time;

	private Date update_time;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "posts_tags", joinColumns = {
			@JoinColumn(name = "post_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "tag_id", referencedColumnName = "id") })
	private List<Tag> tags = new ArrayList<>();

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "author_id")
	private Author author;

	protected Post() {
	}

	public Post(final String title, final String content, final String status,  
			final String locale, 
			final Date create_time,
			final Date update_time, final List<Tag> tags) {
		this.title = title;
		this.content = content;
		this.status = status;
		this.locale = locale;
		this.create_time = create_time;
		this.update_time = update_time;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
