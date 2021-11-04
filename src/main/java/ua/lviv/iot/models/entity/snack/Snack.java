package ua.lviv.iot.models.entity.snack;

import lombok.Data;

@Data
public class Snack {
    private Integer id;
    private String trademark;
    private String type;
    private Integer price;
    private Integer producer_id;
}
