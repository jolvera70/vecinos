package com.jb.vecinos.repository.calle;

import com.jb.vecinos.entities.Calle;


import java.util.List;

/**
 * Created by bvelasco on 20/11/2016.
 */
public interface CalleDao {

    public List<Calle> getCatalogo();

    public void add(Calle calle);

    public List<Calle> listCalle();


}
