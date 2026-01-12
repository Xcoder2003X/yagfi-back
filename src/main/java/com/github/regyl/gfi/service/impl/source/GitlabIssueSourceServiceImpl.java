package com.github.regyl.gfi.service.impl.source;

import com.github.regyl.gfi.service.source.IssueSourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GitlabIssueSourceServiceImpl implements IssueSourceService {

    @Override
    public void upload() {
        //todo implement later
        //https://docs.gitlab.com/api/graphql/
        //https://gitlab.com/gitlab-org/gitlab-development-kit/-/issues/1822
    }
}
