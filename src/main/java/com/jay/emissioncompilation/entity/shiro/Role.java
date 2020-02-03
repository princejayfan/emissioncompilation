package com.jay.emissioncompilation.entity.shiro;


import javax.persistence.*;
import java.util.Set;

/**
 * @Author Jay
 * @Version 1.0
 */

@Entity
public class Role {

    @Id
    private Integer roleId;
    private String roleName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "role_permission",
            joinColumns = {@JoinColumn(name = "ROLE_ID", referencedColumnName = "roleId")},
            inverseJoinColumns = {@JoinColumn(name = "PERMISSION_ID", referencedColumnName = "permissionId")})
    private Set<Permission> permissions;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
}