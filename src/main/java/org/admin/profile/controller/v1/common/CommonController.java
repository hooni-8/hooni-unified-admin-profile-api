package org.admin.profile.controller.v1.common;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.admin.profile.service.v1.common.CommonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Tag(name = "2.Common", description = "Common")
@RestController
@RequestMapping("/common")
@RequiredArgsConstructor
public class CommonController {

    private final CommonService commonService;

    @PostMapping("/insert")
    public void commonCodeCreate() {
        log.info("Insert Common Code!!!!!!!!!");

    }

    @PostMapping("/update")
    public void commonCodeUpdate() {

    }

    @PostMapping("/select")
    public void commonCodeSelect() {

    }

    @PostMapping("/delete")
    public void commonCodeDelete() {

    }
}
