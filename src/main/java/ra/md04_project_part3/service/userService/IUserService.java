package ra.md04_project_part3.service.userService;

import ra.md04_project_part3.model.dto.request.FormLogin;
import ra.md04_project_part3.model.dto.request.FormRegister;
import ra.md04_project_part3.model.dto.response.JWTResponse;

public interface IUserService {
      boolean register(FormRegister formRegister);
        JWTResponse login(FormLogin formLogin);
}
