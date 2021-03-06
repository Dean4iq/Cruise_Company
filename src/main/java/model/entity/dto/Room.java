package model.entity.dto;

import model.annotation.TableField;
import model.annotation.TableName;

import java.io.Serializable;
import java.util.Objects;

@TableName(name = "room")
public class Room implements Serializable {
    @TableField(name = "ro_id", primaryKey = true)
    private int id;
    @TableField(name = "room_type_rt_id")
    private int roomTypeId;
    @TableField(name = "ship_sh_id")
    private int shipId;

    private RoomType roomType;
    private Ship ship;
    private int price;
    private boolean available = true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(int roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public int getShipId() {
        return shipId;
    }

    public void setShipId(int shipId) {
        this.shipId = shipId;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Room room = (Room) object;
        return getId() == room.getId() &&
                getRoomTypeId() == room.getRoomTypeId() &&
                getShipId() == room.getShipId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRoomTypeId(), getShipId());
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomTypeId=" + roomTypeId +
                ", shipId=" + shipId +
                '}';
    }
}
