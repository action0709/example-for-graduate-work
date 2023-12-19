package ru.skypro.homework.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Data
public class AdsDto {
    private Integer count;
    private List<AdDto> result;
}
