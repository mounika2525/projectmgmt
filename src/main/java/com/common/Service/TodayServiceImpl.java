package com.common.Service;

import com.common.Repository.TodayRepository;
import com.common.model.Dashboard;
import com.common.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by mounika on 07/09/16.
 */
@Transactional
@Service
public class TodayServiceImpl implements TodayService{


    private TodayRepository todayRepository;

    @Autowired
    public TodayServiceImpl(TodayRepository todayRepository) {
        this.todayRepository = todayRepository;
    }

    @Override
    public List<Dashboard> findbydate(Date workday) {
        return todayRepository.findbydate(workday);
    }
}
