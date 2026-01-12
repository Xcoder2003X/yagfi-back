package com.github.regyl.gfi.service.impl.label;

import com.github.regyl.gfi.model.LabelModel;
import com.github.regyl.gfi.service.label.LabelService;
import com.github.regyl.gfi.util.ResourceUtil;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;

@Component
public class LabelServiceImpl implements LabelService {

    private final static Collection<LabelModel> DATA;

    static {
        DATA = Arrays.stream(ResourceUtil.getFilePayload("labels.txt").split(System.lineSeparator()))
                .map(LabelModel::new)
                .toList();
    }

    @Override
    public Collection<LabelModel> findAll() {
        return DATA;
    }
}
