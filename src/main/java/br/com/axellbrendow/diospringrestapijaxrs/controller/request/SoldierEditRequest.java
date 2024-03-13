package br.com.axellbrendow.diospringrestapijaxrs.controller.request;

import br.com.axellbrendow.diospringrestapijaxrs.enums.Race;

public class SoldierEditRequest {
    private String name;
    private Race race;
    private String weapon;
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
