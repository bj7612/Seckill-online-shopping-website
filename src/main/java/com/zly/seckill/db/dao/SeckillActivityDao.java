package com.zly.seckill.db.dao;

import com.zly.seckill.db.po.SeckillActivity;

import java.util.List;

public interface SeckillActivityDao {

    public List<SeckillActivity> querySeckillActivitysByStatus(int activityStatus);

    public void inertSeckillActivity(SeckillActivity seckillActivity);

    public SeckillActivity querySeckillActivityById(long activityId);

    public void updateSeckillActivity(SeckillActivity seckillActivity);

    boolean lockStock(Long seckillActivityId);

    boolean deductStock(Long seckillActivityId);

    void revertStock(Long seckillActivityId);
}
