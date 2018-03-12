package com.liwc.mapper;

import com.liwc.model.Attachment;

public interface AttachmentMapper {
	int deleteByPrimaryKey(String fileId);

	int insert(Attachment record);

	int insertSelective(Attachment record);

	Attachment selectByPrimaryKey(String fileId);

	int updateByPrimaryKeySelective(Attachment record);

	int updateByPrimaryKey(Attachment record);
}