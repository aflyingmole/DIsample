package test.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MembersVo {
    private int num;
    private String name;
    private String phone;
    private String addr;
    private Date regdate;
}
