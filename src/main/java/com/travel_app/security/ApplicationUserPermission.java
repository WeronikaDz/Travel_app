package com.travel_app.security;

public enum ApplicationUserPermission {

    EDIT_TRIP("edit:trip"),
    BUY_TRIP("buy:trip"),
    ADD_TRIP("add:trip"),
    DELETE_TRIP("delete:trip");
    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }
    public String getPermission(){
        return permission;
    }
}
