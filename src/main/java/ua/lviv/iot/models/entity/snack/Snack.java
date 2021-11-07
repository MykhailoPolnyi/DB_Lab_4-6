package ua.lviv.iot.models.entity.snack;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

@Data
@Table(name = "snack")
public class Snack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "trademark")
    @NotNull
    private String trademark;

    @Column(name = "snack_type")
    @NotNull
    private String type;

    @Column(name = "price")
    @NotNull
    private Integer price;

    @Column(name = "snack_producer_id")
    @NotNull
    private Integer producer_id;
}
