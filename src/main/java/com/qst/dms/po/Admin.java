package com.qst.dms.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private Integer a_id;
    private String a_username;

    @JsonIgnore
    private String a_password;

    private String a_name;
    private Integer a_phone;

    @JsonIgnore
    private Integer a_power;

    private String a_describe;


}
