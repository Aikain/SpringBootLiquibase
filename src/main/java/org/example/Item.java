package org.example;

import jakarta.persistence.Entity;
import java.util.UUID;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Item extends AbstractPersistable<UUID> {

}
