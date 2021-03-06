package model.dao.sql;

public enum SQLScripts {
    INSTANCE;

    public final String FIND_CRUISE_FULL_INFO = "SELECT * FROM cruise INNER JOIN ship ON sh_id=ship_sh_id INNER JOIN route ON cr_id=cruise_cr_id INNER JOIN harbor ON hb_id=harbor_hb_id INNER JOIN country ON co_id=country_co_id ORDER BY route.departure;";
    public final String FIND_SEAT_FOR_CRUISE_INFO = "SELECT * FROM room INNER JOIN room_type ON room_type_rt_id=rt_id INNER JOIN ship ON ship_sh_id=sh_id INNER JOIN cruise AS cr ON cr.ship_sh_id=sh_id WHERE cr_id=?;";
    public final String FIND_ROOM_INFO = "SELECT * FROM room INNER JOIN room_type ON room_type_rt_id=rt_id WHERE ro_id=?";
    public final String FIND_TICKETS_FOR_CRUISE = "SELECT * FROM ticket INNER JOIN cruise ON cruise_cr_id=cr_id WHERE cr_id=?;";
    public final String FIND_EXCURSION_LIST_FOR_CRUISE = "SELECT * FROM excursion INNER JOIN harbor ON harbor_hb_id=hb_id INNER JOIN route as ro ON ro.harbor_hb_id=hb_id INNER JOIN country ON country_co_id=co_id INNER JOIN cruise ON cruise_cr_id=cr_id WHERE cr_id=? ORDER BY hb_id ASC";
    public final String FIND_TICKET_FULL_INFO = "SELECT * FROM ticket INNER JOIN user ON user_login=login INNER JOIN room ON room_ro_id=ro_id INNER JOIN room_type ON room_type_rt_id=rt_id INNER JOIN room_bonuses AS rb ON rb.room_type_rt_id=rt_id INNER JOIN bonuses ON bonuses_bo_id=bo_id INNER JOIN cruise ON cruise_cr_id=cr_id INNER JOIN ship ON cruise.ship_sh_id=sh_id WHERE ti_id=?;";
}