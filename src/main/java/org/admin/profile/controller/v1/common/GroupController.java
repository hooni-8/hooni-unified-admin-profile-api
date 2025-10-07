package org.admin.profile.controller.v1.common;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.admin.profile.controller.v1.BaseV1Controller;
import org.admin.profile.service.v1.common.GroupService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Tag(name = "1.Group", description = "Group")
@RestController
@RequestMapping("/group")
@RequiredArgsConstructor
public class GroupController extends BaseV1Controller {

    private final GroupService groupService;

    @PostMapping("/insert")
    public void groupCreate() {
        log.info("Insert Group Code!!!!!!!!!");
    }

    @PostMapping("/update")
    public void groupUpdate() {

    }

    @PostMapping("/select")
    public void groupSelect() {

    }

    @PostMapping("/delete")
    public void groupDelete() {

    }
}
