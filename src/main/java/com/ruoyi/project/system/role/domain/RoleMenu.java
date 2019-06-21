package com.ruoyi.project.system.role.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 角色和菜单关联 sys_role_menu
 *
 * @author ruoyi
 */
@Setter
@Getter
public class RoleMenu {

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 菜单ID
     */
    private Long menuId;

}
