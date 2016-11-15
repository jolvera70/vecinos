package com.jb.vecinos.repository.colony;

import com.jb.vecinos.entities.Colony;

import java.util.List;

/**
 * Created by jolvera on 13/11/2016.
 */
public interface ColonyDao {

    public void add(Colony colony);

    public List<Colony> listColony();

}
