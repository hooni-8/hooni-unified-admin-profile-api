package org.admin.profile.service.v1.common;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.admin.profile.mapper.v1.common.CommonMapper;
import org.admin.profile.model.v1.common.CommonCreate;
import org.admin.profile.model.v1.common.CommonSelect;
import org.admin.profile.model.v1.common.request.CommonCreateRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CommonService {

    private final CommonMapper commonMapper;

    public void commonCodeCreate(String userCode, CommonCreateRequest request) {

        CommonCreate commonCreate = CommonCreate.builder()
                .groupId(request.getGroupId())
                .commonCode(request.getCommonCode())
                .commonCodeName(request.getCommonCodeName())
                .userCode(userCode)
                .build();

        commonMapper.commonCodeCreate(commonCreate);
    }

    public List<CommonSelect> commonCodeSelect(String groupId) {
        return commonMapper.commonCodeSelect(groupId);
    }
}
