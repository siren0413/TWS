package com.tws.cassandra.repository;

import com.tws.cassandra.dao.TickDAO;
import com.tws.shared.ib.model.Tick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by yijunmao on 1/17/16.
 */
@Repository
public class TickRepository {

    @Autowired
    @Qualifier("tickDAO")
    private TickDAO tickDAO;

    public void save(Tick tick) {
        tickDAO.save(tick);
    }

    public Tick get(Tick tick) {
        return tickDAO.get(tick);
    }

}
