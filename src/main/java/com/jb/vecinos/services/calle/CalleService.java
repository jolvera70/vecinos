package com.jb.vecinos.services.calle;

import com.jb.vecinos.entities.Calle;

import java.util.List;

/**
 * Created by bvelasco on 20/11/2016.
 */
public interface CalleService {
    public void insertCalle(Calle calle);
    public List<Calle> listCalle();
}
