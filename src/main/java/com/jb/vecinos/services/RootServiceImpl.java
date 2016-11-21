package com.jb.vecinos.services;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Created by jolvera on 13/11/2016.
 */
@Service
public class RootServiceImpl implements RootService{

    final static Logger logger = Logger.getLogger(RootServiceImpl.class);

    public void prueba(int i){
        if(i == 0){
            logger.info("OK");
        }else{
            logger.info("FAIL");
        }
    }

}
