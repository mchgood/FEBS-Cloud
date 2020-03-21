package entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Auther: tangkc
 * @Date: 2020/3/21
 * @Description:
 */
@Data
@Accessors(chain = true)
public class FebsAuthUser implements Serializable {
    private static final long serialVersionUID = -1748289340320186418L;

    private String username;

    private String password;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked= true;

    private boolean credentialsNonExpired= true;

    private boolean enabled= true;
}
