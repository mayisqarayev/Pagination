package com.paginationlesson.dto;

import java.time.LocalDate;

public class UserRequestDto {

    String name;
    LocalDate birtDate;

    public UserRequestDto(String name, LocalDate birtDate) {
        this.name = name;
        this.birtDate = birtDate;
    }

    @Override
    public String toString() {
        return "UserRequestDto{" +
                "name='" + name + '\'' +
                ", birtDate=" + birtDate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(LocalDate birtDate) {
        this.birtDate = birtDate;
    }

    public UserRequestDto() {
    }
}
