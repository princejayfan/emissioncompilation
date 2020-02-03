package com.jay.emissioncompilation.entity.shiro;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author Jay
 * @Version 1.0
 */
@Entity
public class Permission {

    @Id
    private Integer permissionId;
    private String permissionName;
    private String permission;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
