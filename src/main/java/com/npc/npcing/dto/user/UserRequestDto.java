package com.npc.npcing.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
    private String username;
    private String password;
    private String email;
    private String role;
    private String useAt;
}

public enum useAt {
    Y,
    N
}
