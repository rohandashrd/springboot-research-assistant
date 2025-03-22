package com.springboot.research.assistant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeminiResponse {

    private List<Candidate> candidates;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Candidate {
        private Content content;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Content {
        private List<Part> parts;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Part {
        private String text;
    }
}
