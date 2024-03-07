package com.ohgiraffers.model.dto;

public class MenuDTO {

    private int menuCode;
    private String menuName;
    private int menuPirce;
    private int categoryCode;

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    private String orderableStatus;

    public MenuDTO() {
    }  //construtor 아무것도 선택 x

    public MenuDTO(int menuCode, String menuName, int menuPirce, int categoryCode, String orderableStatus) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPirce = menuPirce;
        this.categoryCode = categoryCode;
        this.orderableStatus = orderableStatus;
    }  //construtor 다 선택

    public int getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuPirce() {
        return menuPirce;
    }

    public void setMenuPirce(int menuPirce) {
        this.menuPirce = menuPirce;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    } //geter,seter 선택

    @Override
    public String toString() {
        return "MenuDTO{" +
                "menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", menuPirce=" + menuPirce +
                ", categoryCode=" + categoryCode +
                '}';
    } // tostring 선택
}
