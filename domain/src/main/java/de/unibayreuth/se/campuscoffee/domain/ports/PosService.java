package de.unibayreuth.se.campuscoffee.domain.ports;

import de.unibayreuth.se.campuscoffee.domain.Pos;
import de.unibayreuth.se.campuscoffee.domain.exceptions.PosNotFoundException;
import org.springframework.lang.NonNull;

import java.util.List;

/**
 * Interface for the implementation of the POS service that the data layer provides as a port.
 */
public interface PosService {
    void clear();
    @NonNull
    List<Pos> getAll();
    @NonNull
    Pos getById(@NonNull Long id) throws PosNotFoundException;
    @NonNull
    Pos upsert(@NonNull Pos pos) throws PosNotFoundException;
}
