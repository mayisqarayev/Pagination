package com.paginationlesson.dto;


import com.paginationlesson.entity.UserEntity;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class PageResponseDto {

    Long elements;
    Integer pages;
    List<UserEntity> content;
    Boolean hasNext;

    public PageResponseDto(Long elements, Integer pages, List<UserEntity> content, Boolean hasNext) {
        this.elements = elements;
        this.pages = pages;
        this.content = content;
        this.hasNext = hasNext;
    }

    public PageResponseDto() {

    }

    public Long getElements() {
        return elements;
    }

    public void setElements(Long elements) {
        this.elements = elements;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public List<UserEntity> getContent() {
        return content;
    }

    public void setContent(List<UserEntity> content) {
        this.content = content;
    }

    public Boolean getHasNext() {
        return hasNext;
    }

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }
}
