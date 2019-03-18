package model.entity.dto;

import annotation.TableField;
import annotation.TableName;

@TableName(name = "bonuses")
public class Bonuse {
    @TableField(name = "bo_id", primaryKey = true, autoincremented = true)
    private int id;
    @TableField(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}