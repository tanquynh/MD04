package ra.md04_project_part3.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class FormRegister {
    private String username;
    private String fullName;
    private String email;
    private String password;
    private Set<String> roles;
}
