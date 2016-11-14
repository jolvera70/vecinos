package com.jb.vecinos.services.colony;

import com.jb.vecinos.entities.Colony;
import com.jb.vecinos.repository.colony.ColonyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jolvera on 13/11/2016.
 */
@Service
public class ColonyServiceImpl implements ColonyService{

    @Autowired
    ColonyDao colonyDao;

    @Override
    public void insertColony(Colony colony) {
        colonyDao.add(colony);
    }
}
