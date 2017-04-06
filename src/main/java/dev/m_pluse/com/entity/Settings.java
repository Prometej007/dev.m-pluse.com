package dev.m_pluse.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Settings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String backgroundColor;
	@OneToOne
	private Resource avatar;
	private String backgroundImage;
	@OneToOne
	private Developer developer;
	private String color;
	private String href;
	private String fontStyle;

	public Settings() {
		super();
	}

	public Settings(String backgroundColor, Resource avatar, String backgroundImage, Developer developer, String color,
			String href, String fontStyle) {
		super();
		this.backgroundColor = backgroundColor;
		this.avatar = avatar;
		this.backgroundImage = backgroundImage;
		this.developer = developer;
		this.color = color;
		this.href = href;
		this.fontStyle = fontStyle;
	}

	public int getId() {
		return id;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public Resource getAvatar() {
		return avatar;
	}

	public String getBackgroundImage() {
		return backgroundImage;
	}

	public Developer getDeveloper() {
		return developer;
	}

	public String getColor() {
		return color;
	}

	public String getHref() {
		return href;
	}

	public String getFontStyle() {
		return fontStyle;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public void setAvatar(Resource avatar) {
		this.avatar = avatar;
	}

	public void setBackgroundImage(String backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public void setFontStyle(String fontStyle) {
		this.fontStyle = fontStyle;
	}

}
