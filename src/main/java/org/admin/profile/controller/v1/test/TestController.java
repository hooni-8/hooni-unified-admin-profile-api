package org.admin.profile.controller.v1.test;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@Slf4j
@Tag(name = "3.test", description = "test")
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    @PostMapping("/disk/usage")
    public void diskUsage() {
        File root = new File("/");

        long total = root.getTotalSpace();      // 전체 용량
        long free = root.getFreeSpace();        // 남은 용량
        long usable = root.getUsableSpace();    // 사용 가능한 용량

        log.info("Total space: {}", format(total));
        log.info("Free space: {}", format(free));
        log.info("Usable space: {}", format(usable));
    }

    private static String format(long size) {
        return String.format("%.2f GB", size / 1024.0 / 1024 / 1024);
    }
}
