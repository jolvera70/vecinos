package com.jb.vecinos.services.colony;

import com.jb.vecinos.entities.Colony;

import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
public interface ColonyService {
    public void insertColony(Colony colony);
    public List<Colony> listColony();
}
