package org.soujava;

import javax.money.MonetaryAmount;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.PositiveOrZero;
import java.time.Year;
import java.util.Optional;

public class Player {

    static final Year SOCCER_BORN = Year.of(1863);

    @NotBlank
    private String name;

    @NotNull
    @PastOrPresent
    private Year start;

    @PastOrPresent
    private Year end;

    @NotNull
    private Email email;

    @NotNull
    private Position position;

    @NotNull
    private MonetaryAmount salary;

    @PositiveOrZero
    private int goal = 0;

    Player(String name, Year start, Year end, Email email, Position position, MonetaryAmount salary) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.email = email;
        this.position = position;
        this.salary = salary;
    }

    @Deprecated
    Player() {
    }

    public String getName() {
        return name;
    }

    public Year getStart() {
        return start;
    }

    public Email getEmail() {
        return email;
    }

    public Position getPosition() {
        return position;
    }

    public MonetaryAmount getSalary() {
        return salary;
    }

    public Optional<Year> getEnd() {
        return Optional.ofNullable(end);
    }

    public int getGoal() {
        return goal;
    }

    public void goal() {
        goal++;
    }

    public void setEnd(Year end) {
        if (end != null && end.isBefore(start)) {
            throw new IllegalArgumentException("the last year of a player must be equal or higher than the start.");
        }
        this.end = end;
    }


}