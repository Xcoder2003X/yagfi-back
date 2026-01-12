package com.github.regyl.gfi.service.impl;

import com.github.regyl.gfi.dto.github.GithubIssueDto;
import com.github.regyl.gfi.dto.github.GithubSearchDto;
import com.github.regyl.gfi.dto.github.IssueData;
import com.github.regyl.gfi.entity.IssueEntity;
import com.github.regyl.gfi.repository.IssueRepository;
import com.github.regyl.gfi.repository.RepoRepository;
import com.github.regyl.gfi.service.DataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.function.Function;

@Slf4j
@Component
@RequiredArgsConstructor
public class DataServiceImpl implements DataService {

    private final IssueRepository issueRepository;
    private final RepoRepository repoRepository;
    private final Function<GithubIssueDto, IssueEntity> issueMapper;

    @Async
    @Override
    public void save(IssueData response) {
        if (response == null || response.getSearch() == null || CollectionUtils.isEmpty(response.getSearch().getNodes())) {
            return;
        }

        GithubSearchDto search = response.getSearch();
        List<IssueEntity> issues = search.getNodes().stream()
                .map(issueMapper)
                .toList();

        log.info("Issues found: {}", issues.size());
        issueRepository.saveAll(issues);
    }
}
