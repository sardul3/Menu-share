package com.menushare.menushare.repo;

import com.menushare.menushare.model.QrCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QrCodeRepo extends JpaRepository<QrCode, Long> {
}