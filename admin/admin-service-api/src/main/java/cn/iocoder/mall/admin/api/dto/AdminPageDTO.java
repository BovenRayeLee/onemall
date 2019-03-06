package cn.iocoder.mall.admin.api.dto;

import javax.validation.constraints.NotNull;

public class AdminPageDTO {

    private String nickname;

    @NotNull(message = "页码不能为空")
    private Integer pageNo;
    @NotNull(message = "每页条数不能为空")
    private Integer pageSize;

    public Integer getPageNo() {
        return pageNo;
    }

    public AdminPageDTO setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public AdminPageDTO setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public AdminPageDTO setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

}