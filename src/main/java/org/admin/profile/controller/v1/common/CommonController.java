package org.admin.profile.controller.v1.common;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.admin.profile.common.model.DefaultUserInfo;
import org.admin.profile.controller.v1.BaseV1Controller;
import org.admin.profile.model.v1.common.CommonSelect;
import org.admin.profile.model.v1.common.request.CommonCreateRequest;
import org.admin.profile.model.v1.common.request.CommonSelectRequest;
import org.admin.profile.model.v1.group.request.GroupCreateRequest;
import org.admin.profile.service.v1.common.CommonService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Tag(name = "2.Common", description = "Common")
@RestController
@RequestMapping("/common")
@RequiredArgsConstructor
public class CommonController extends BaseV1Controller {

    private final CommonService commonService;

    @PostMapping("/insert")
    public void commonCodeCreate(@Parameter(hidden = true) @AuthenticationPrincipal DefaultUserInfo userInfo, @RequestBody CommonCreateRequest request) {
        try {
            commonService.commonCodeCreate(userInfo.getUserCode(), request);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }

    @PostMapping("/update")
    public void commonCodeUpdate() {

    }

    @PostMapping("/select")
    public List<CommonSelect> commonCodeSelect(@RequestBody CommonSelectRequest request) {
        try {
            return commonService.commonCodeSelect(request.getGroupId());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    @PostMapping("/delete")
    public void commonCodeDelete() {

    }
}
