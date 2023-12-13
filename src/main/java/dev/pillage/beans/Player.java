package dev.pillage.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Player {
    private int level;
    private float xp;
    private String name;
    private int id;

}
