package com.liwc.model;

import java.io.Serializable;

public class Attachment implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4817555805554772995L;

	private String fileId;

	private String fileName;

	private String fileGroup;

	private String orgnName;

	private String fileSize;

	private String fileExt;

	private String filePath;

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId == null ? null : fileId.trim();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName == null ? null : fileName.trim();
	}

	public String getFileGroup() {
		return fileGroup;
	}

	public void setFileGroup(String fileGroup) {
		this.fileGroup = fileGroup == null ? null : fileGroup.trim();
	}

	public String getOrgnName() {
		return orgnName;
	}

	public void setOrgnName(String orgnName) {
		this.orgnName = orgnName == null ? null : orgnName.trim();
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize == null ? null : fileSize.trim();
	}

	public String getFileExt() {
		return fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt == null ? null : fileExt.trim();
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath == null ? null : filePath.trim();
	}
}