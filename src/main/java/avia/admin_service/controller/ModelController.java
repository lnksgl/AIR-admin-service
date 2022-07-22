package avia.admin_service.controller;

import avia.admin_service.service.ModelService;
import avia.admin_service.vo.UserModelResponseTemplate;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static lombok.AccessLevel.PRIVATE;

@RestController
@RequiredArgsConstructor
@RequestMapping("/models")
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class ModelController {

    private ModelService modelService;

    @GetMapping
    public UserModelResponseTemplate getModelWithUser() {
        return modelService.getModelWithUser();
    }
}
