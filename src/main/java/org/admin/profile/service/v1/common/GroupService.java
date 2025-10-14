package org.admin.profile.service.v1.common;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.admin.profile.common.model.DefaultUserInfo;
import org.admin.profile.mapper.v1.common.GroupMapper;
import org.admin.profile.model.v1.group.GroupCreate;
import org.admin.profile.model.v1.group.GroupSelect;
import org.admin.profile.model.v1.group.request.GroupCreateRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupMapper groupMapper;

    public void groupCodeCreate(String userCode, GroupCreateRequest request) {

        GroupCreate groupCreate = GroupCreate.builder()
                .groupCode(request.getGroupCode())
                .groupName(request.getGroupName())
                .userCode(userCode)
                .build();

        groupMapper.groupCodeCreate(groupCreate);

    }

    public List<GroupSelect> groupCodeSelect() {
        return groupMapper.groupCodeSelect();
    }
}
