package com.github.regyl.gfi.dto.github;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GithubIssueDto {

    private String id;
    private int number;
    private String title;
    private String url;
    private GithubIssueState state;
    private OffsetDateTime updatedAt;
    private GithubRepositoryDto repository;
    private GithubLabelsDto labels;
    private String bodyText;
}
