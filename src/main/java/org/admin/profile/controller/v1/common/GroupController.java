package org.admin.profile.controller.v1.common;


import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.admin.profile.common.model.DefaultUserInfo;
import org.admin.profile.controller.v1.BaseV1Controller;
import org.admin.profile.model.v1.group.GroupSelect;
import org.admin.profile.model.v1.group.request.GroupCreateRequest;
import org.admin.profile.service.v1.common.GroupService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Tag(name = "1.Group", description = "Group")
@RestController
@RequestMapping("/group")
@RequiredArgsConstructor
public class GroupController extends BaseV1Controller {

    private final GroupService groupService;

    @PostMapping("/insert")
    public void groupCodeCreate(@Parameter(hidden = true) @AuthenticationPrincipal DefaultUserInfo userInfo, @RequestBody GroupCreateRequest request) {
        try {
            groupService.groupCodeCreate(userInfo.getUserCode(), request);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }

    @PostMapping("/update")
    public void groupCodeUpdate() {

    }

    @PostMapping("/select")
    public List<GroupSelect> groupCodeSelect() {
        try {
            return groupService.groupCodeSelect();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    @PostMapping("/delete")
    public void groupCodeDelete() {

    }
}
