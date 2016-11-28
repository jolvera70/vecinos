package com.jb.vecinos.repository.inquilino;

import com.jb.vecinos.entities.Inquilino;


/**
 * Created by bvelasco on 27/11/2016.
 */
public interface InquilinoDao {

    public void add(Inquilino inquilino);

    public Inquilino getInquilino();

}
