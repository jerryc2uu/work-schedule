package com.example.demo.service;

import com.example.demo.entity.Shift;
import com.example.demo.repository.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ShiftService {

    private final ShiftRepository shiftRepository;

    @Autowired
    public ShiftService(ShiftRepository shiftRepository) {
        this.shiftRepository = shiftRepository;
    }

    // 근무지 등록
    @Transactional
    public Shift createShift(Shift shift) {
        return shiftRepository.save(shift);
    }

    // 모든 근무지 조회
    public List<Shift> getAllShifts() {
        return shiftRepository.findAll();
    }

}