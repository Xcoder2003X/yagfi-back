package com.github.regyl.gfi.service.impl.source;

import com.github.regyl.gfi.service.source.IssueSourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@RequiredArgsConstructor
public class IssueLoaderServiceImpl {

    private final Collection<IssueSourceService> sourceServices;

    @Scheduled(fixedRate = 3_600_000, initialDelay = 1000) //1 hour
    public void upload() {
        sourceServices.forEach(IssueSourceService::upload);
    }
}
