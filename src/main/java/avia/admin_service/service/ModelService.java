package avia.admin_service.service;

import avia.admin_service.entity.Model;
import avia.admin_service.repository.ModelRepository;
import avia.admin_service.vo.User;
import avia.admin_service.vo.UserModelResponseTemplate;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static lombok.AccessLevel.PRIVATE;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class ModelService {

    private ModelRepository modelRepository;
    private RestTemplate restTemplate;

    public UserModelResponseTemplate getModelWithUser() {
        //TODO
        Model model = new Model(1L, "1", 1L);

        User user = new User(1L, "1", "1", "1");
        //restTemplate.getForObject("http://user_service/users/", User.class);
        return new UserModelResponseTemplate(user, model);
    }
}
