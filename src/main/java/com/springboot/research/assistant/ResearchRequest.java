package com.springboot.research.assistant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class ResearchRequest {

    private String content;
    private String operation;
}
